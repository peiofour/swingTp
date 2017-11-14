package com.ynov.tpswing;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Arrays;

class MyTable extends AbstractTableModel{

    private ArrayList<Object[]> _data;
    private String[] _title;

    MyTable(){
        this._data = new ArrayList<>();
        this._title = new String[]{"Nom", "Prénom", "Adresse", "Poste"};
    }

    public void addRow(Object[] row){
        this._data.add(row);
    }

    @Override
    public int getRowCount() {
        return this._data.size();
    }

    @Override
    public int getColumnCount() {
        return this._title.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return this._data.get(rowIndex)[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return this._title[column];
    }
}
