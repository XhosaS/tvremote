package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class goz implements wlk {
    public static final gov a = new gov();
    private static final zdy c = zdy.h("com/google/android/apps/tvsearch/observers/DeviceNameUpdateReceiver");
    public final idl b;
    private final iax d;
    private final fda e;
    private final agte f;
    private final ahbt g;
    private final agow h;
    private final agow i;
    private final gph j;
    private final fsv k;
    private final gtu l;

    public goz(iax iaxVar, fda fdaVar, agte agteVar, ahbt ahbtVar, agow agowVar, agow agowVar2, gph gphVar, fsv fsvVar, gtu gtuVar, idl idlVar) {
        iaxVar.getClass();
        fdaVar.getClass();
        agteVar.getClass();
        ahbtVar.getClass();
        agowVar.getClass();
        gtuVar.getClass();
        idlVar.getClass();
        this.d = iaxVar;
        this.e = fdaVar;
        this.f = agteVar;
        this.g = ahbtVar;
        this.h = agowVar;
        this.i = agowVar2;
        this.j = gphVar;
        this.k = fsvVar;
        this.l = gtuVar;
        this.b = idlVar;
    }

    @Override // defpackage.wlk
    public final zyd a(Intent intent) {
        intent.getClass();
        idl idlVar = this.b;
        if (idlVar.e(this.l.c()) != idj.b) {
            return zxy.a;
        }
        String strI = idlVar.i();
        Object objA = this.i.a();
        objA.getClass();
        String str = (String) objA;
        if (agvy.c(strI, str)) {
            return zxy.a;
        }
        ((zdv) c.b().q("com/google/android/apps/tvsearch/observers/DeviceNameUpdateReceiver", "onReceive", 68, "DeviceNameUpdateReceiver.kt")).F("Updating device name from: '%s' to: '%s'", strI, str);
        return ahkr.c(this.g, 0, new gow(this, str, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0165, code lost:
    
        if (r15 != r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01c4, code lost:
    
        if (defpackage.ahal.a(r2, r5, r0) != r1) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r14, defpackage.agsw r15) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.goz.b(java.lang.String, agsw):java.lang.Object");
    }
}
