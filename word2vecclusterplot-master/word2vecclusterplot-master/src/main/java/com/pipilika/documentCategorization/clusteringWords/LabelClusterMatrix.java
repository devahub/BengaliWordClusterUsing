/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pipilika.documentCategorization.clusteringWords;

/**
 *
 * @author adnan
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */
public class LabelClusterMatrix {

    public static void main(String[] args) {

        Map lebelMap = new HashMap();
        int mapLoc = 1;
        String row = "";
        String label = "";

        BufferedReader in = null;
        try {
            File embfileDir = new File("word2vec_model.txt");
            in = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(embfileDir), "UTF8"));
            String str;
            StringTokenizer st = null;
            while ((str = in.readLine()) != null) {
                row = str;
                st = new StringTokenizer(row, " ");

                while (st.hasMoreElements()) {
                    label = (String) st.nextElement();
                    break;

                }

                lebelMap.put(mapLoc, label);
                mapLoc++;
            }
            System.out.println(lebelMap.size());

            File outputfileDir = new File("cluster_lebeled.csv");

            Writer out = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(outputfileDir), "UTF8"));

            in.close();

            File rtsnefileDir = new File("cluster_vector_out.csv");
            mapLoc = 1;

            in = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(rtsnefileDir), "UTF8"));

            while ((str = in.readLine()) != null) {
                row = str;
                row = lebelMap.get(mapLoc) + " " + str;
                out.append(row + "\n");
                out.flush();
                mapLoc++;

            }

            out.close();
            in.close();

        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(LabelClusterMatrix.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LabelClusterMatrix.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(LabelClusterMatrix.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
