package br.com.igti.android.eventos;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class Evento {
    private UUID mId;
    private String mTitulo;
    private String mDescricao;
    private Date  mData;

    public Evento(){
        mId   = UUID.randomUUID();
        mData = Calendar.getInstance().getTime();
    }

    public Evento(UUID id, String titulo, String descricao, Date date) {
        mId = id;
        mTitulo = titulo;
        mDescricao = descricao;
        mData = date;
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public void setTitulo(String titulo) {
        mTitulo = titulo;
    }

    public Date getData() {
        return mData;
    }

    public void setData(Date data) {
        mData = data;
    }

    public String getDescricao() {
        return mDescricao;
    }

    public void setDescricao(String descricao) {
        mDescricao = descricao;
    }

    @Override
    public String toString() {
        return mTitulo;
    }
}
