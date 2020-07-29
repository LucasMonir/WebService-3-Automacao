
package registro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the registro package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeficienciaCountResponse_QNAME = new QName("http://registro/", "deficienciaCountResponse");
    private final static QName _SexoCount_QNAME = new QName("http://registro/", "sexoCount");
    private final static QName _EtniaCountResponse_QNAME = new QName("http://registro/", "etniaCountResponse");
    private final static QName _IdadeCountResponse_QNAME = new QName("http://registro/", "idadeCountResponse");
    private final static QName _EtniaCount_QNAME = new QName("http://registro/", "etniaCount");
    private final static QName _OrientacaoCount_QNAME = new QName("http://registro/", "orientacaoCount");
    private final static QName _EscolaridadeCountResponse_QNAME = new QName("http://registro/", "escolaridadeCountResponse");
    private final static QName _EmpregoCountResponse_QNAME = new QName("http://registro/", "empregoCountResponse");
    private final static QName _RendaCount_QNAME = new QName("http://registro/", "rendaCount");
    private final static QName _RendaCountResponse_QNAME = new QName("http://registro/", "rendaCountResponse");
    private final static QName _OrientacaoCountResponse_QNAME = new QName("http://registro/", "orientacaoCountResponse");
    private final static QName _EscolaridadeCount_QNAME = new QName("http://registro/", "escolaridadeCount");
    private final static QName _SexoCountResponse_QNAME = new QName("http://registro/", "sexoCountResponse");
    private final static QName _DeficienciaCount_QNAME = new QName("http://registro/", "deficienciaCount");
    private final static QName _IdadeCount_QNAME = new QName("http://registro/", "idadeCount");
    private final static QName _EmpregoCount_QNAME = new QName("http://registro/", "empregoCount");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: registro
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EscolaridadeCountResponse }
     * 
     */
    public EscolaridadeCountResponse createEscolaridadeCountResponse() {
        return new EscolaridadeCountResponse();
    }

    /**
     * Create an instance of {@link DeficienciaCountResponse }
     * 
     */
    public DeficienciaCountResponse createDeficienciaCountResponse() {
        return new DeficienciaCountResponse();
    }

    /**
     * Create an instance of {@link SexoCount }
     * 
     */
    public SexoCount createSexoCount() {
        return new SexoCount();
    }

    /**
     * Create an instance of {@link EtniaCountResponse }
     * 
     */
    public EtniaCountResponse createEtniaCountResponse() {
        return new EtniaCountResponse();
    }

    /**
     * Create an instance of {@link IdadeCountResponse }
     * 
     */
    public IdadeCountResponse createIdadeCountResponse() {
        return new IdadeCountResponse();
    }

    /**
     * Create an instance of {@link EtniaCount }
     * 
     */
    public EtniaCount createEtniaCount() {
        return new EtniaCount();
    }

    /**
     * Create an instance of {@link OrientacaoCount }
     * 
     */
    public OrientacaoCount createOrientacaoCount() {
        return new OrientacaoCount();
    }

    /**
     * Create an instance of {@link DeficienciaCount }
     * 
     */
    public DeficienciaCount createDeficienciaCount() {
        return new DeficienciaCount();
    }

    /**
     * Create an instance of {@link IdadeCount }
     * 
     */
    public IdadeCount createIdadeCount() {
        return new IdadeCount();
    }

    /**
     * Create an instance of {@link EmpregoCount }
     * 
     */
    public EmpregoCount createEmpregoCount() {
        return new EmpregoCount();
    }

    /**
     * Create an instance of {@link EmpregoCountResponse }
     * 
     */
    public EmpregoCountResponse createEmpregoCountResponse() {
        return new EmpregoCountResponse();
    }

    /**
     * Create an instance of {@link RendaCount }
     * 
     */
    public RendaCount createRendaCount() {
        return new RendaCount();
    }

    /**
     * Create an instance of {@link RendaCountResponse }
     * 
     */
    public RendaCountResponse createRendaCountResponse() {
        return new RendaCountResponse();
    }

    /**
     * Create an instance of {@link OrientacaoCountResponse }
     * 
     */
    public OrientacaoCountResponse createOrientacaoCountResponse() {
        return new OrientacaoCountResponse();
    }

    /**
     * Create an instance of {@link EscolaridadeCount }
     * 
     */
    public EscolaridadeCount createEscolaridadeCount() {
        return new EscolaridadeCount();
    }

    /**
     * Create an instance of {@link SexoCountResponse }
     * 
     */
    public SexoCountResponse createSexoCountResponse() {
        return new SexoCountResponse();
    }

    /**
     * Create an instance of {@link Pessoa }
     * 
     */
    public Pessoa createPessoa() {
        return new Pessoa();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeficienciaCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://registro/", name = "deficienciaCountResponse")
    public JAXBElement<DeficienciaCountResponse> createDeficienciaCountResponse(DeficienciaCountResponse value) {
        return new JAXBElement<DeficienciaCountResponse>(_DeficienciaCountResponse_QNAME, DeficienciaCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SexoCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://registro/", name = "sexoCount")
    public JAXBElement<SexoCount> createSexoCount(SexoCount value) {
        return new JAXBElement<SexoCount>(_SexoCount_QNAME, SexoCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EtniaCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://registro/", name = "etniaCountResponse")
    public JAXBElement<EtniaCountResponse> createEtniaCountResponse(EtniaCountResponse value) {
        return new JAXBElement<EtniaCountResponse>(_EtniaCountResponse_QNAME, EtniaCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdadeCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://registro/", name = "idadeCountResponse")
    public JAXBElement<IdadeCountResponse> createIdadeCountResponse(IdadeCountResponse value) {
        return new JAXBElement<IdadeCountResponse>(_IdadeCountResponse_QNAME, IdadeCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EtniaCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://registro/", name = "etniaCount")
    public JAXBElement<EtniaCount> createEtniaCount(EtniaCount value) {
        return new JAXBElement<EtniaCount>(_EtniaCount_QNAME, EtniaCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrientacaoCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://registro/", name = "orientacaoCount")
    public JAXBElement<OrientacaoCount> createOrientacaoCount(OrientacaoCount value) {
        return new JAXBElement<OrientacaoCount>(_OrientacaoCount_QNAME, OrientacaoCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EscolaridadeCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://registro/", name = "escolaridadeCountResponse")
    public JAXBElement<EscolaridadeCountResponse> createEscolaridadeCountResponse(EscolaridadeCountResponse value) {
        return new JAXBElement<EscolaridadeCountResponse>(_EscolaridadeCountResponse_QNAME, EscolaridadeCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpregoCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://registro/", name = "empregoCountResponse")
    public JAXBElement<EmpregoCountResponse> createEmpregoCountResponse(EmpregoCountResponse value) {
        return new JAXBElement<EmpregoCountResponse>(_EmpregoCountResponse_QNAME, EmpregoCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RendaCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://registro/", name = "rendaCount")
    public JAXBElement<RendaCount> createRendaCount(RendaCount value) {
        return new JAXBElement<RendaCount>(_RendaCount_QNAME, RendaCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RendaCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://registro/", name = "rendaCountResponse")
    public JAXBElement<RendaCountResponse> createRendaCountResponse(RendaCountResponse value) {
        return new JAXBElement<RendaCountResponse>(_RendaCountResponse_QNAME, RendaCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrientacaoCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://registro/", name = "orientacaoCountResponse")
    public JAXBElement<OrientacaoCountResponse> createOrientacaoCountResponse(OrientacaoCountResponse value) {
        return new JAXBElement<OrientacaoCountResponse>(_OrientacaoCountResponse_QNAME, OrientacaoCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EscolaridadeCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://registro/", name = "escolaridadeCount")
    public JAXBElement<EscolaridadeCount> createEscolaridadeCount(EscolaridadeCount value) {
        return new JAXBElement<EscolaridadeCount>(_EscolaridadeCount_QNAME, EscolaridadeCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SexoCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://registro/", name = "sexoCountResponse")
    public JAXBElement<SexoCountResponse> createSexoCountResponse(SexoCountResponse value) {
        return new JAXBElement<SexoCountResponse>(_SexoCountResponse_QNAME, SexoCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeficienciaCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://registro/", name = "deficienciaCount")
    public JAXBElement<DeficienciaCount> createDeficienciaCount(DeficienciaCount value) {
        return new JAXBElement<DeficienciaCount>(_DeficienciaCount_QNAME, DeficienciaCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdadeCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://registro/", name = "idadeCount")
    public JAXBElement<IdadeCount> createIdadeCount(IdadeCount value) {
        return new JAXBElement<IdadeCount>(_IdadeCount_QNAME, IdadeCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmpregoCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://registro/", name = "empregoCount")
    public JAXBElement<EmpregoCount> createEmpregoCount(EmpregoCount value) {
        return new JAXBElement<EmpregoCount>(_EmpregoCount_QNAME, EmpregoCount.class, null, value);
    }

}
