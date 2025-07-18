package defpackage;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class alf implements alx {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ alf(alh alhVar, bbe bbeVar, int i) {
        this.c = i;
        this.a = alhVar;
        this.b = bbeVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [byb, java.lang.Object] */
    @Override // defpackage.alx
    public final Object a(ami amiVar) {
        if (this.c != 0) {
            AtomicBoolean atomicBoolean = aed.a;
            if (amiVar.d()) {
                return this.b.a(this.a);
            }
            Log.e("ClearcutLoggerApiImpl", "Error resolving compliance data.", amiVar.b());
            return amiVar;
        }
        boolean z = amiVar.b() instanceof agj;
        Object obj = this.b;
        Object obj2 = this.a;
        if (z) {
            return ((alh) obj2).a(((bbe) obj).c);
        }
        if (!(amiVar.b() instanceof afy)) {
            return amiVar;
        }
        afy afyVar = (afy) amiVar.b();
        afyVar.getClass();
        if (afyVar.a() != 29514) {
            return amiVar;
        }
        return ((alh) obj2).a(((bbe) obj).c);
    }

    public /* synthetic */ alf(byb bybVar, adh adhVar, int i) {
        this.c = i;
        this.b = bybVar;
        this.a = adhVar;
    }
}
