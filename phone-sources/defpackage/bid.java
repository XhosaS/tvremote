package defpackage;

import android.support.v7.appcompat.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bid implements bib {
    public static final bii a = new bij(new xb(13), new aru(16));
    public final Map b;
    public bie c;
    public final ki d;
    private final yjv e;

    public bid() {
        this((byte[]) null);
    }

    public final void a(bie bieVar, Map map, Object obj) {
        Map mapB = bieVar.b();
        if (mapB.isEmpty()) {
            map.remove(obj);
        } else {
            map.put(obj, mapB);
        }
    }

    @Override // defpackage.bib
    public final void c(Object obj, yjz yjzVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(533563200);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(obj) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(this) ? 128 : 256;
        }
        if (baoVarD.L((i2 & 147) != 146, i2 & 1)) {
            baoVarD.N(obj);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj2 = ban.a;
            if (objT == obj2) {
                yjv yjvVar = this.e;
                if (!((Boolean) yjvVar.a(obj)).booleanValue()) {
                    throw new IllegalArgumentException(a.cj(obj, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle."));
                }
                bih bihVar = new bih(new bif((Map) this.b.get(obj), yjvVar));
                basVar.ae(bihVar);
                objT = bihVar;
            }
            bih bihVar2 = (bih) objT;
            bcm.j(new bcq[]{big.a.c(bihVar2), ghg.a.c(bihVar2)}, yjzVar, baoVarD, (i2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
            ygi ygiVar = ygi.a;
            boolean zH = baoVarD.H(this) | baoVarD.H(obj) | baoVarD.H(bihVar2);
            Object objT2 = basVar.T();
            if (zH || objT2 == obj2) {
                objT2 = new gk(this, obj, bihVar2, 13);
                basVar.ae(objT2);
            }
            bbn.c(ygiVar, (yjv) objT2, baoVarD);
            baoVarD.r();
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sv(this, obj, yjzVar, i, 11);
        }
    }

    @Override // defpackage.bib
    public final void d(Object obj) {
        if (this.d.g(obj) == null) {
            this.b.remove(obj);
        }
    }

    public bid(Map map) {
        this.b = map;
        long[] jArr = kj.a;
        this.d = new ki((byte[]) null);
        this.e = new bap(this, 9);
    }

    public /* synthetic */ bid(byte[] bArr) {
        this(new LinkedHashMap());
    }
}
