package com.wimoor.erp.purchase.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wimoor.common.user.UserInfo;
import com.wimoor.erp.common.pojo.entity.ERPBizException;
import com.wimoor.erp.purchase.mapper.PurchaseFormMapper;
import com.wimoor.erp.purchase.pojo.dto.PurchaseSaveDTO;
import com.wimoor.erp.purchase.pojo.entity.PurchaseForm;
import com.wimoor.erp.purchase.pojo.entity.PurchaseFormEntry;
import com.wimoor.erp.purchase.pojo.entity.PurchaseFormPrintIP;
import com.wimoor.erp.purchase.service.IPurchaseFormService;
import lombok.RequiredArgsConstructor;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.List;
import java.util.Map;


@Service("purchaseFormService")
@RequiredArgsConstructor
public class PurchaseFormServiceImpl extends ServiceImpl<PurchaseFormMapper, PurchaseForm> implements IPurchaseFormService {
    @Override
    public IPage<Map<String, Object>> getPurchaseFormEntry(Page<?> page, Map<String, Object> param) {
        return null;
    }

    @Override
    public Map<String, Object> savePurchaseDataAction(PurchaseSaveDTO dto) throws ERPBizException {
        return Collections.emptyMap();
    }

    @Override
    public boolean updatePurchaseFormEntry(PurchaseFormEntry item, String warehouseid) throws ERPBizException {
        return false;
    }

    @Override
    public PurchaseFormEntry updatePrice(UserInfo user, String id, Float itemprice, Integer amount, Float orderprice) throws ERPBizException {
        return null;
    }

    @Override
    public int approvals(UserInfo user, String ids) throws ERPBizException {
        return 0;
    }

    @Override
    public Map<String, Object> getDetailMap(String id, String shopid) throws ERPBizException {
        return Collections.emptyMap();
    }

    @Override
    public Map<String, Object> getTraceDetailMap(String id, String shopid, String ftype, String actiontype) {
        return Collections.emptyMap();
    }

    @Override
    public int findSumaryNeedApply(String shopid) {
        return 0;
    }

    @Override
    public int findSumaryNeedin(String shopid) {
        return 0;
    }

    @Override
    public int findSumaryNeedpay(String shopid) {
        return 0;
    }

    @Override
    public void purchaseReturn(UserInfo user, String id, String remark) throws ERPBizException {

    }

    @Override
    public Map<String, Object> updateNotice(String id, String notice, String shopid, String userid) throws ERPBizException {
        return Collections.emptyMap();
    }

    @Override
    public boolean updateWarehouse(UserInfo user, String id, String warehouseid) throws ERPBizException {
        return false;
    }

    @Override
    public List<Map<String, Object>> getLastFormByMaterial(Object id, int i) {
        return Collections.emptyList();
    }

    @Override
    public Map<String, Object> getLastOneFormByMaterial(Object id) {
        return Collections.emptyMap();
    }

    @Override
    public List<Map<String, Object>> getPurchaseRecSumReport(Map<String, Object> param) {
        return Collections.emptyList();
    }

    @Override
    public List<Map<String, Object>> purchaseFormReport(Map<String, Object> param) {
        return Collections.emptyList();
    }

    @Override
    public IPage<Map<String, Object>> purchaseFormReport(Page<?> page, Map<String, Object> param) {
        return null;
    }

    @Override
    public List<Map<String, Object>> getPurchaseSumReport(Map<String, Object> param) {
        return Collections.emptyList();
    }

    @Override
    public Map<String, Object> getViewData(String id, String shopid) {
        return Collections.emptyMap();
    }

    @Override
    public Map<String, Object> getPurchaseFormSummary(UserInfo user, Map<String, Object> param) {
        return Collections.emptyMap();
    }

    @Override
    public IPage<Map<String, Object>> getPurchaseForm(Page<?> page, Map<String, Object> param) {
        return null;
    }

    @Override
    public List<Map<String, Object>> getFormDetail(String id, String shopid) {
        return Collections.emptyList();
    }

    @Override
    public Map<String, Object> purchaseFormReportTotal(Map<String, Object> param) {
        return Collections.emptyMap();
    }

    @Override
    public Map<String, Object> getLastPurchaseRecord(String shopid, String warehouseid) {
        return Collections.emptyMap();
    }

    @Override
    public List<Map<String, Object>> getPurchaseSumReportNew(Map<String, Object> param) {
        return Collections.emptyList();
    }

    @Override
    public IPage<Map<String, Object>> getPayRecSumReport(Page<?> page, Map<String, Object> param) {
        return null;
    }

    @Override
    public void setExcelBook(Workbook workbook, Map<String, Object> param) {

    }

    @Override
    public void setPurchaseSkuItemExcelBook(SXSSFWorkbook workbook, Map<String, Object> param) {

    }

    @Override
    public List<Map<String, Object>> loadPurchaseFormDate(UserInfo user, String planid, String warehouseid, String ftype, List<String> item_material_list) {
        return Collections.emptyList();
    }

    @Override
    public void getPurchaseRecInfoExcelBook(SXSSFWorkbook workbook, Map<String, Object> param) {

    }

    @Override
    public List<Map<String, Object>> findSupplierByForm(String formid) {
        return Collections.emptyList();
    }

    @Override
    public void downloadPurchasePaymentWord(HttpServletRequest request, HttpServletResponse response, String recid) {

    }

    @Override
    public Map<String, Object> getPurchaseNumAllStatus(Map<String, Object> param) {
        return Collections.emptyMap();
    }

    @Override
    public Map<String, Object> uploadPurchaseListByExcel(Sheet sheet, Map<String, Object> map) {
        return Collections.emptyMap();
    }

    @Override
    public Map<String, Object> getPurchaseRecordInfo(String reciveId) {
        return Collections.emptyMap();
    }

    @Override
    public void setPurchaseFormReportExcelBook(SXSSFWorkbook workbook, Map<String, Object> param) {

    }

    @Override
    public boolean updateDeliveryDate(String entryid, String deliverydate) {
        return false;
    }

    @Override
    public List<Map<String, Object>> selectNeedSendMsgShop() {
        return Collections.emptyList();
    }

    @Override
    public List<Map<String, Object>> selectPurchaseNotify(String shopid) {
        return Collections.emptyList();
    }

    @Override
    public int savePurchaseForm(UserInfo user, List<PurchaseForm> formList, String planwarehouseid) throws ERPBizException {
        return 0;
    }

    @Override
    public PurchaseFormEntry recallEntry(UserInfo user, String id) {
        return null;
    }

    @Override
    public List<Map<String, Object>> getEntryData(String id) {
        return Collections.emptyList();
    }

    @Override
    public Map<String, Object> deleteEntry(UserInfo user, String id) {
        return Collections.emptyMap();
    }

    @Override
    public List<Map<String, Object>> getLastFormsByMaterials(List<String> ids) {
        return Collections.emptyList();
    }

    @Override
    public void setPrintIp(UserInfo userinfo, String ip, String paper, String addressid) {

    }

    @Override
    public PurchaseFormPrintIP getPrintIp(UserInfo userinfo) {
        return null;
    }

    @Override
    public PurchaseFormPrintIP getPrintIpByAddress(UserInfo userinfo, String addressid) {
        return null;
    }

    @Override
    public Map<String, Object> reSubmit(UserInfo userinfo, String id) {
        return Collections.emptyMap();
    }
}
