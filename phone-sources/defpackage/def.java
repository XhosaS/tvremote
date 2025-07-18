package defpackage;

import defpackage.dpe;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class def<T extends dpe> {
    public static final def a = new def(null);
    public final dfw b = new dfu();
    private boolean c;

    private def() {
    }

    public static int a(dgl dglVar, int i, Object obj) {
        int iW = ddz.W(i);
        if (dglVar == dgl.GROUP) {
            iW += iW;
        }
        dgm dgmVar = dgm.INT;
        int iAa = 4;
        switch (dglVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                iAa = 8;
                return iW + iAa;
            case 1:
                ((Float) obj).floatValue();
                return iW + iAa;
            case 2:
                iAa = ddz.aa(((Long) obj).longValue());
                return iW + iAa;
            case 3:
                iAa = ddz.aa(((Long) obj).longValue());
                return iW + iAa;
            case 4:
                iAa = ddz.L(((Integer) obj).intValue());
                return iW + iAa;
            case 5:
                ((Long) obj).longValue();
                iAa = 8;
                return iW + iAa;
            case 6:
                ((Integer) obj).intValue();
                return iW + iAa;
            case 7:
                ((Boolean) obj).booleanValue();
                iAa = 1;
                return iW + iAa;
            case 8:
                iAa = obj instanceof dds ? ddz.H((dds) obj) : ddz.V((String) obj);
                return iW + iAa;
            case 9:
                iAa = ((dfh) obj).h();
                return iW + iAa;
            case 10:
                iAa = obj instanceof det ? ddz.N((det) obj) : ddz.O(((dfh) obj).h());
                return iW + iAa;
            case 11:
                iAa = obj instanceof dds ? ddz.H((dds) obj) : ddz.O(((byte[]) obj).length);
                return iW + iAa;
            case 12:
                iAa = ddz.Y(((Integer) obj).intValue());
                return iW + iAa;
            case 13:
                iAa = obj instanceof dem ? ddz.L(((dem) obj).a()) : ddz.L(((Integer) obj).intValue());
                return iW + iAa;
            case 14:
                ((Integer) obj).intValue();
                return iW + iAa;
            case 15:
                ((Long) obj).longValue();
                iAa = 8;
                return iW + iAa;
            case 16:
                iAa = ddz.R(((Integer) obj).intValue());
                return iW + iAa;
            case 17:
                iAa = ddz.T(((Long) obj).longValue());
                return iW + iAa;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static void f(ddz ddzVar, dgl dglVar, int i, Object obj) {
        if (dglVar == dgl.GROUP) {
            ddzVar.z(i, 3);
            ddzVar.ai((dfh) obj);
            ddzVar.z(i, 4);
            return;
        }
        ddzVar.z(i, dglVar.t);
        dgm dgmVar = dgm.INT;
        switch (dglVar.ordinal()) {
            case 0:
                ddzVar.af(((Double) obj).doubleValue());
                break;
            case 1:
                ddzVar.ah(((Float) obj).floatValue());
                break;
            case 2:
                ddzVar.D(((Long) obj).longValue());
                break;
            case 3:
                ddzVar.D(((Long) obj).longValue());
                break;
            case 4:
                ddzVar.s(((Integer) obj).intValue());
                break;
            case 5:
                ddzVar.q(((Long) obj).longValue());
                break;
            case 6:
                ddzVar.o(((Integer) obj).intValue());
                break;
            case 7:
                ddzVar.j(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof dds)) {
                    ddzVar.y((String) obj);
                    break;
                } else {
                    ddzVar.m((dds) obj);
                    break;
                }
            case 9:
                ddzVar.ai((dfh) obj);
                break;
            case 10:
                ddzVar.u((dfh) obj);
                break;
            case 11:
                if (!(obj instanceof dds)) {
                    byte[] bArr = (byte[]) obj;
                    ddzVar.E(bArr, bArr.length);
                    break;
                } else {
                    ddzVar.m((dds) obj);
                    break;
                }
            case 12:
                ddzVar.B(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof dem)) {
                    ddzVar.s(((Integer) obj).intValue());
                    break;
                } else {
                    ddzVar.s(((dem) obj).a());
                    break;
                }
            case 14:
                ddzVar.o(((Integer) obj).intValue());
                break;
            case 15:
                ddzVar.q(((Long) obj).longValue());
                break;
            case 16:
                ddzVar.ak(((Integer) obj).intValue());
                break;
            case 17:
                ddzVar.am(((Long) obj).longValue());
                break;
        }
    }

    private static boolean i(Map.Entry entry) {
        throw null;
    }

    public final int b(Map.Entry entry) {
        entry.getValue();
        throw null;
    }

    public final Iterator c() {
        return g() ? Collections.emptyIterator() : this.b.entrySet().iterator();
    }

    public final /* synthetic */ Object clone() {
        def defVar = new def();
        dfw dfwVar = this.b;
        if (dfwVar.a() > 0) {
            Map.Entry entryE = dfwVar.e(0);
            entryE.getValue();
            throw null;
        }
        Iterator it = dfwVar.b().iterator();
        if (!it.hasNext()) {
            return defVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getValue();
        throw null;
    }

    public final void d() {
        if (this.c) {
            return;
        }
        dfw dfwVar = this.b;
        int iA = dfwVar.a();
        for (int i = 0; i < iA; i++) {
            Map.Entry entryE = dfwVar.e(i);
            if (entryE.getValue() instanceof dek) {
                ((dek) entryE.getValue()).n();
            }
        }
        if (!dfwVar.c) {
            if (dfwVar.a() > 0) {
                throw null;
            }
            Iterator it = dfwVar.b().iterator();
            if (it.hasNext()) {
                throw null;
            }
        }
        if (!dfwVar.c) {
            dfwVar.b = dfwVar.b.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(dfwVar.b);
            dfwVar.d = dfwVar.d.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(dfwVar.d);
            dfwVar.c = true;
        }
        this.c = true;
    }

    public final void e(Map.Entry entry) {
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof def) {
            return this.b.equals(((def) obj).b);
        }
        return false;
    }

    final boolean g() {
        return this.b.isEmpty();
    }

    public final boolean h() {
        dfw dfwVar = this.b;
        int iA = dfwVar.a();
        for (int i = 0; i < iA; i++) {
            if (!i(dfwVar.e(i))) {
                return false;
            }
        }
        Iterator it = dfwVar.b().iterator();
        while (it.hasNext()) {
            if (!i((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    private def(byte[] bArr) {
        d();
        d();
    }
}
