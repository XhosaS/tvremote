package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cdy {
    private static final cdy a = new cds();

    public static cdy g(cdh cdhVar, cdh cdhVar2) {
        int iB = cdhVar2.b();
        return iB == 0 ? a : iB <= 28 ? new cdw(cdhVar, cdhVar2) : new cdx(cdhVar, cdhVar2);
    }

    public abstract int a();

    public abstract Object b(cck cckVar);

    public abstract Set c();

    public abstract void d(cdo cdoVar, Object obj);
}
