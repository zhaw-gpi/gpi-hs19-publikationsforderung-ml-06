package ch.zhaw.gpi.publfoerderung;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * JournalEntity
 */
@Entity(name = "Journal")
public class JournalEntity {

    @Id
    @GeneratedValue
    private Long journalId;
    private String journalTitle;
    private Integer journalRating;

    public Long getJournalId() {
        return journalId;
    }

    public void setJournalId(Long journalId) {
        this.journalId = journalId;
    }

    public String getJournalTitle() {
        return journalTitle;
    }

    public void setJournalTitle(String journalTitle) {
        this.journalTitle = journalTitle;
    }

    public Integer getJournalRating() {
        return journalRating;
    }

    public void setJournalRating(Integer journalRating) {
        this.journalRating = journalRating;
    }

    
    
}