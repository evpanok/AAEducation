package ua.com.avesacademy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "PagePPF")

public class PagePPF {


        @Id
        @GeneratedValue
        private long id;

        private String name;
        private String title;
        private String text;
        private String video;
        private String wordFile;
        private String exelFile;
        private String pdfFile;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getWordFile() {
        return wordFile;
    }

    public void setWordFile(String wordFile) {
        this.wordFile = wordFile;
    }

    public String getExelFile() {
        return exelFile;
    }

    public void setExelFile(String exelFile) {
        this.exelFile = exelFile;
    }

    public String getPdfFile() {
        return pdfFile;
    }

    public void setPdfFile(String pdfFile) {
        this.pdfFile = pdfFile;
    }

    public PagePPF() {
    }

    public PagePPF(String name, String title, String text, String video, String wordFile, String exelFile, String pdfFile) {

        this.name = name;
        this.title = title;
        this.text = text;
        this.video = video;
        this.wordFile = wordFile;
        this.exelFile = exelFile;
        this.pdfFile = pdfFile;
    }
}
