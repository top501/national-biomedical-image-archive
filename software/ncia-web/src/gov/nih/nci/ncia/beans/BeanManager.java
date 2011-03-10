package gov.nih.nci.ncia.beans;

import gov.nih.nci.ncia.beans.basket.BasketBean;
import gov.nih.nci.ncia.beans.populator.ViewSeriesPopulatorQCBean;
import gov.nih.nci.ncia.beans.qctool.QcToolUpdateBean;
import gov.nih.nci.ncia.beans.savedquery.SavedQueryBean;
import gov.nih.nci.ncia.beans.searchform.SearchLookupBean;
import gov.nih.nci.ncia.beans.searchform.SearchWorkflowBean;
import gov.nih.nci.ncia.beans.searchresults.SearchResultBean;
import gov.nih.nci.ncia.beans.searchresults.SeriesSearchResultBean;
import gov.nih.nci.ncia.beans.security.AnonymousLoginBean;
import gov.nih.nci.ncia.beans.security.SecurityBean;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;


/**
 * Encapsulates the retrieval of beans from the faces context
 *
 * @author dietrichj
 *
 */
public class BeanManager {
    /**
     *
     */
    public static BasketBean getBasketBean() {
        return (BasketBean) getBean("#{basketBean}");
    }
    
    /**
    *
    */
   public static QcToolUpdateBean getQcToolUpdateBean() {
       return (QcToolUpdateBean) getBean("#{qcToolUpdateBean}");
   }


    /**
     *
     */
    public static SecurityBean getSecurityBean() {
        return (SecurityBean) getBean("#{securityBean}");
    }

    /**
     * Look up SecurityBean via the HTTP session directly instead of
     * via the FacesContext
     *
     * @param request - The HttpRequest
     */
    public static SecurityBean getSecurityBean(HttpServletRequest request) {
        return (SecurityBean) request.getSession().getAttribute("securityBean");
    }

    /**
     *
     */
    public static SearchWorkflowBean getSearchWorkflowBean() {
        return (SearchWorkflowBean) getBean("#{searchWorkflowBean}");
    }

    /**
     *
     */
    public static SavedQueryBean getSavedQueryBean() {
        return (SavedQueryBean) getBean("#{savedQueryBean}");
    }

    /**
     *
     */
    public static SearchLookupBean getSearchLookupBean() {
        return (SearchLookupBean) getBean("#{searchLookupBean}");
    }

    /**
     *
     */
    public static SearchResultBean getSearchResultBean() {
        return (SearchResultBean) getBean("#{searchResultBean}");
    }

    public static SeriesSearchResultBean getSeriesSearchResultBean() {
        return (SeriesSearchResultBean) getBean("#{seriesSearchResultBean}");
    }

    public static ViewSeriesPopulatorQCBean getViewSeriesPopulatorQCBean() {
        return (ViewSeriesPopulatorQCBean) getBean("#{viewSeriesPopulatorQCBean}");
    }


    /**
     * 
     */
    public static AnonymousLoginBean getAnonymousLoginBean() {
        return (AnonymousLoginBean) getBean("#{anonymousLoginBean}");
    }

    /**
     *  Generically retrieves a bean from the context
     */
    private static Object getBean(String beanId) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        if(facesContext == null) {
            return null;
        }
        return facesContext.getApplication().createValueBinding(beanId)
                           .getValue(facesContext);
    }
}