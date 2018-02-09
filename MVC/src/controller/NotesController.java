package controller;

import model.NotesModel;

public class NotesController
{
    private NotesModel model;

    public NotesController()
    {
        this.model = new NotesModel();
    }

    public void addNewNote(String note)
    {
        model.addNote(note);
    }

    public void deleteNote(int id)
    {
        model.deleteNote(id);
    }
}
