package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dny implements dcn {
    public static final dny a = new dny();
    private static final dnv b;

    static {
        dnv dnvVar = dnv.DEFAULT_INSTANCE;
        dnvVar.getClass();
        b = dnvVar;
    }

    private dny() {
    }

    @Override // defpackage.dcn
    public final /* synthetic */ Object a() {
        return b;
    }

    @Override // defpackage.dcn
    public final Object b(InputStream inputStream) throws dpm, dav {
        dox doxVar;
        try {
            dnv dnvVar = dnv.DEFAULT_INSTANCE;
            int i = doo.h;
            don donVar = new don(inputStream);
            dox doxVar2 = dox.a;
            dqh dqhVar = dqh.a;
            dox doxVar3 = dox.a;
            if (doxVar3 == null) {
                synchronized (dox.class) {
                    doxVar = dox.a;
                    if (doxVar == null) {
                        Class cls = dov.a;
                        dox doxVar4 = null;
                        if (cls != null) {
                            try {
                                doxVar4 = (dox) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (doxVar4 == null) {
                            doxVar4 = dox.b;
                        }
                        dox.a = doxVar4;
                        doxVar = doxVar4;
                    }
                }
                doxVar3 = doxVar;
            }
            dpf dpfVarK = dnvVar.k();
            try {
                try {
                    try {
                        dqk dqkVarB = dqh.a.b(dpfVarK);
                        dop dopVar = donVar.g;
                        if (dopVar == null) {
                            dopVar = new dop(donVar);
                        }
                        dqkVarB.h(dpfVarK, dopVar, doxVar3);
                        dqkVarB.d(dpfVarK);
                        if (dpfVarK != null && !dpfVarK.s()) {
                            throw new dqs().a();
                        }
                        dnv dnvVar2 = (dnv) dpfVarK;
                        dnvVar2.getClass();
                        return dnvVar2;
                    } catch (dpm e) {
                        if (e.a) {
                            throw new dpm(e);
                        }
                        throw e;
                    } catch (dqs e2) {
                        throw e2.a();
                    }
                } catch (IOException e3) {
                    if (e3.getCause() instanceof dpm) {
                        throw ((dpm) e3.getCause());
                    }
                    throw new dpm(e3);
                }
            } catch (RuntimeException e4) {
                if (e4.getCause() instanceof dpm) {
                    throw ((dpm) e4.getCause());
                }
                throw e4;
            }
        } catch (dpm e5) {
            throw new dav("Cannot read proto.", e5);
        }
    }

    @Override // defpackage.dcn
    public final /* bridge */ /* synthetic */ Object c(Object obj, OutputStream outputStream) throws IOException {
        dnv dnvVar = (dnv) obj;
        int iG = dnvVar.g();
        boolean z = dot.e;
        if (iG > 4096) {
            iG = 4096;
        }
        doq doqVar = new doq(outputStream, iG);
        dnvVar.r(doqVar);
        if (doqVar.c > 0) {
            doqVar.i();
        }
        return ygi.a;
    }
}
