package com.example.viewerhello;

import com.groupdocs.viewer.Viewer;
import com.groupdocs.viewer.options.HtmlViewOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ViewerhelloApplication {

    public static void main(String[] args) {
        embedded();
//        SpringApplication.run(ViewerhelloApplication.class, args);
    }

    private static void embedded() {
        System.out.println("embedded::Calling Viewer() constructor");
//        try (Viewer viewer = new Viewer("c:\\temp\\sample.docx"))
        try (Viewer viewer = new Viewer("c:\\temp\\groupdocs\\ms.docx"))
        {
            System.out.println("Calling forEmbeddedResources()");
            HtmlViewOptions viewOptions =
                    HtmlViewOptions.forEmbeddedResources("page_{0}.html");
            viewer.view(viewOptions);
        }
    }
}
