package defpackage;

import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edj extends ecq {
    public static final /* synthetic */ int s = 0;

    @eau(a = eav.NONE)
    @eat(a = 5)
    public List m;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public Boolean n;
    public dtu o;
    public dtu p;
    public dtu q;
    public dtu r;

    public edj() {
        super("DataDiffSection");
    }

    @Override // defpackage.ecq
    /* renamed from: f */
    public final boolean a(ecq ecqVar) {
        if (this == ecqVar) {
            return true;
        }
        if (ecqVar == null || getClass() != ecqVar.getClass()) {
            return false;
        }
        edj edjVar = (edj) ecqVar;
        List list = this.m;
        if (list == null ? edjVar.m != null : !list.equals(edjVar.m)) {
            return false;
        }
        Boolean bool = this.n;
        return bool == null ? edjVar.n == null : bool.equals(edjVar.n);
    }

    @Override // defpackage.ect
    protected final String i(ecr ecrVar) {
        List list = this.m;
        if (list != null) {
            return edn.a(list, new edk(ecrVar, null, list));
        }
        return null;
    }

    @Override // defpackage.ect
    public final boolean l() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01d4  */
    @Override // defpackage.ect
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void p(defpackage.ecr r24, defpackage.ecf r25, defpackage.ecq r26, defpackage.ecq r27) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edj.p(ecr, ecf, ecq, ecq):void");
    }
}
