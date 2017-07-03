package br.com.igti.android.eventos;


import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

public class EventosManager {

    private ArrayList<Evento> mEventos;

    private static EventosManager sEventos;
    private Context mAppContext;

    private EventosManager(Context appContext) {
        mAppContext = appContext;
        mEventos = new ArrayList<Evento>();

        for(int i =0; i<4; i++)  {
            Evento evento = new Evento();
            evento.setTitulo("Item " + i);
            mEventos.add(evento);
        }
    }

    public static EventosManager get(Context c) {
        if (sEventos == null) {
            sEventos = new EventosManager(c.getApplicationContext());
        }
        return sEventos;
    }

    public ArrayList<Evento> getEventos() {
        return mEventos;
    }

    public Evento getEvento(UUID id) {
        for(Evento evento : mEventos) {
            if(evento.getId().equals(id)) {
                return evento;
            }
        }
        return null;
    }

    public void addEvento(Evento evento) {
        mEventos.add(evento);
    }

    public void deleteEvento(Evento evento) {
        mEventos.remove(evento);
    }
}
