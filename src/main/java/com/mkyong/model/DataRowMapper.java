package com.mkyong.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DataRowMapper<T> implements RowMapper<T> {

  public T mapRow(ResultSet rs, int arg1) throws SQLException {
    Report report = new Report();
    report.setVal(rs.getString("val"));
    return null;
  }

}
