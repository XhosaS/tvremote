package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.DirectUpdateDataRelay;
import com.google.protos.youtube.elements.DirectUpdatePropertiesOuterClass$DirectUpdateProperties;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mty implements oeb {
    private final agow a;
    private final aehf b;

    public mty(agow agowVar, aehf aehfVar) {
        this.a = agowVar;
        this.b = aehfVar;
        Boolean bool = false;
        bool.getClass();
    }

    @Override // defpackage.oeb
    public final abwk a() {
        return DirectUpdatePropertiesOuterClass$DirectUpdateProperties.c;
    }

    @Override // defpackage.oee
    public final /* synthetic */ void b(dru druVar, oal oalVar, String str, Object obj, obz obzVar, nzw nzwVar) {
        DirectUpdatePropertiesOuterClass$DirectUpdateProperties directUpdatePropertiesOuterClass$DirectUpdateProperties = (DirectUpdatePropertiesOuterClass$DirectUpdateProperties) obj;
        ByteStore byteStore = (ByteStore) ((yqt) this.a.a()).f();
        if (byteStore == null) {
            throw new ocp("ByteStore is not provided");
        }
        obzVar.F(new mnf(druVar.a.getResources().getDisplayMetrics(), byteStore, (DirectUpdateDataRelay) this.b.a(), directUpdatePropertiesOuterClass$DirectUpdateProperties, new EnumMap(acvm.class)));
    }

    @Override // defpackage.oee
    public final /* synthetic */ void c(dru druVar, oal oalVar, String str, niv nivVar, Object obj, obz obzVar, nzw nzwVar) {
        throw null;
    }
}
