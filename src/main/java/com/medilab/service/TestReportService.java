package com.medilab.service;

import com.medilab.entity.TestReportEntity;
import com.medilab.model.TestReport;

public interface TestReportService {

    TestReportEntity uploadTestReport(TestReport testReport);

    TestReportEntity viewTestReport();






}
