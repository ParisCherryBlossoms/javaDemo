package pdfbox;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.pdfbox.io.IOUtils;
import org.apache.pdfbox.io.MemoryUsageSetting;
import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
 * Copyright 2016 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class NewMergePdfs {
    private static final Log LOG = LogFactory.getLog(NewMergePdfs.class);

    public static void main(String[] a) throws Exception {
        merge();
    }

    public static void merge() throws Exception {
        FileOutputStream fos = new FileOutputStream(new File("02_04_08/merge.pdf"));
        ByteArrayOutputStream mergedPDFOutputStream = null;
        File file1 = new File("02_04_08/sample1.pdf");
        File file2 = new File("02_04_08/sample2.pdf");
        List<InputStream> sources = new ArrayList<InputStream>();
        try {
            sources.add(new FileInputStream(file1));
            sources.add(new FileInputStream(file2));
            mergedPDFOutputStream = new ByteArrayOutputStream();
            //设定来源和目标
            PDFMergerUtility pdfMerger = new PDFMergerUtility();
            pdfMerger.addSources(sources);
            pdfMerger.setDestinationStream(mergedPDFOutputStream);
            //设置合并选项
            PDDocumentInformation pdfDocumentInfo = new PDDocumentInformation();
            pdfMerger.setDestinationDocumentInformation(pdfDocumentInfo);
            //合并
            pdfMerger.mergeDocuments(MemoryUsageSetting.setupMainMemoryOnly());
            fos.write(mergedPDFOutputStream.toByteArray());
            fos.close();
        } catch (Exception e) {
            throw new IOException("PDF merge problem", e);
        } finally {
            for (InputStream source : sources) {
                IOUtils.closeQuietly(source);
            }
            IOUtils.closeQuietly(mergedPDFOutputStream);
            IOUtils.closeQuietly(fos);
        }
    }
}
