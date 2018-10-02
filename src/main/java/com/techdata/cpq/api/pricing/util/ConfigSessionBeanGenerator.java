/*package com.techdata.cpq.api.pricing.util;

import java.rmi.RemoteException;
import java.util.Hashtable;

import javax.ejb.CreateException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.sap.custdev.projects.fbs.slc.ejb.IConfigSessionBeanHome;
import com.sap.custdev.projects.fbs.slc.ejb.IConfigSessionBeanRemote;

*//**
 * administrator / T3chdAtA1
 * @author SAP Custom Development
 * @version Draft 0.9
 *//*

@Component
public class ConfigSessionBeanGenerator {
	
	@Autowired
	Environment env;

	private static Hashtable<String, String> jndiCtxProps;
	private static IConfigSessionBeanRemote configSessionBean;
	private static IConfigSessionBeanHome configSessionBeanHome;
	
	private static final Logger logger = LogManager.getLogger(ConfigSessionBeanGenerator.class);

	public IConfigSessionBeanRemote getConfigSessionBean() throws RemoteException, CreateException, NamingException {
		// create the initial context for the JNDI lookup using properties
		jndiCtxProps = new Hashtable<String, String>();
		jndiCtxProps.put(Context.INITIAL_CONTEXT_FACTORY,"com.sap.engine.services.jndi.InitialContextFactoryImpl"); 
		jndiCtxProps.put(Context.URL_PKG_PREFIXES, "com.sap.engine.services");
		String host = env.getProperty("cpq.server.url");
		logger.info("Using host : azrcpqappd00, port : 50104 and username : administrator ");
		String username = env.getProperty("cpq.server.username");
		String password = env.getProperty("cpq.server.password");
		jndiCtxProps.put(Context.PROVIDER_URL, host);
		jndiCtxProps.put(Context.SECURITY_PRINCIPAL, username);
		jndiCtxProps.put(Context.SECURITY_CREDENTIALS, password);
		InitialContext ctx = new InitialContext(jndiCtxProps);

		// execute the lookup using the object name as it can be found in the EJB Explorer of the NW AS Java
		String lookupString = "ejb:/appName=sap.com/cdev~fbs_slc_java, jarName=sap.com~cdev~fbs_slc_jee~ejbjar.jar, beanName=ConfigSessionBeanBean, interfaceName=com.sap.custdev.projects.fbs.slc.ejb.IConfigSessionBeanHome";
		Object remoteHome = ctx.lookup(lookupString);

		// obtain instance of the bean object
		configSessionBeanHome = (IConfigSessionBeanHome) PortableRemoteObject.narrow(remoteHome, IConfigSessionBeanHome.class);
		String kboSwitch = "true";
		String sessionId = null;
		String dataSourceName = null;
		boolean onDemandCsticCreation = false;
		String languageISOCode = "EN";
		configSessionBean = configSessionBeanHome.create(kboSwitch, sessionId, dataSourceName, onDemandCsticCreation, languageISOCode );
		logger.info("Config session bean has been created : "+configSessionBean);
		return configSessionBean;
		}
}*/