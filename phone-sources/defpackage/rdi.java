package defpackage;

import android.graphics.drawable.Drawable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class rdi {
    public final ysn a;
    public boolean b;
    public final yjv c = new psn(this, 18);
    public final vrs d;
    public final yjv e;
    private final rem f;
    private final int g;
    private final vrp h;
    private final vrp i;
    private final vrp j;
    private final yjv k;
    private final yjv l;
    private final yjv m;

    public rdi(rem remVar, ysn ysnVar, vrs vrsVar, yjv yjvVar) {
        this.a = ysnVar;
        this.f = remVar;
        this.d = vrsVar;
        this.e = yjvVar;
        int i = vqy.a;
        this.g = vqy.a();
        vrp vrpVarA = vrsVar.a(new qyx(6));
        this.h = vrpVarA;
        vrp vrpVarA2 = vrsVar.a(new qyx(7));
        this.i = vrpVarA2;
        vrp vrpVarA3 = vrsVar.a(new qyx(8));
        this.j = vrpVarA3;
        int i2 = 14;
        byte[] bArr = null;
        this.k = new ikc((Object) this, (Object) vrpVarA, (Object) null, i2, bArr);
        this.l = new ikc((Object) this, (Object) vrpVarA2, (Object) vrpVarA, i2, bArr);
        this.m = new ikc((Object) this, (Object) vrpVarA3, (Object) null, 14, (byte[]) null);
    }

    private static vpn d(ImmutableList immutableList, vrp vrpVar, int i) {
        byte[] bArr = null;
        if (immutableList.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(yfm.z(immutableList, 10));
        Iterator<E> it = immutableList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            str.getClass();
            arrayList.add(new vqe(str));
        }
        return new vpn(arrayList, vrpVar, i, vro.PRIMARY, new vpl(bArr));
    }

    public rdp a() {
        char c;
        vre vreVarAn;
        rep repVar;
        vri vriVar;
        vrh vrhVar;
        vps vorVar;
        Drawable drawable;
        String str;
        rem remVar = this.f;
        ret retVar = (ret) remVar.j.a();
        rei reiVar = (rei) remVar.k.a();
        if (!remVar.p().booleanValue() || retVar == null || reiVar == null) {
            return null;
        }
        Drawable drawable2 = retVar.a;
        vra vraVar = new vra(drawable2 != null ? new voq(drawable2, retVar.c, 4) : new vor(retVar.b, retVar.c, null));
        vqe vqeVar = new vqe(reiVar.a);
        vro vroVar = vro.ON_SURFACE;
        dvv dvvVar = remVar.l;
        tst tstVar = (tst) dvvVar.a();
        vql vqlVar = new vql(vqeVar, vroVar, 2, Integer.valueOf((tstVar == null || !tstVar.g()) ? 2 : 1));
        tst tstVar2 = (tst) dvvVar.a();
        vql vqlVar2 = (tstVar2 == null || (str = (String) tstVar2.f()) == null) ? null : new vql(new vqe(str), vro.ON_SURFACE_VARIANT, 4, 1);
        tst tstVar3 = (tst) remVar.p.a();
        vrh vrhVar2 = (tstVar3 == null || (drawable = (Drawable) tstVar3.f()) == null) ? null : new vrh(new voq(drawable, false, 6), 4);
        tst tstVar4 = (tst) remVar.t.a();
        if (tstVar4 == null || (repVar = (rep) tstVar4.f()) == null) {
            c = 0;
            vreVarAn = null;
        } else {
            rei reiVar2 = (rei) repVar.a.f();
            if (reiVar2 != null) {
                vqe vqeVar2 = new vqe(reiVar2.a);
                boolean z = repVar.c;
                int i = true != z ? 2 : 4;
                if (z) {
                    vroVar = vro.ON_SURFACE_VARIANT;
                }
                c = 0;
                vriVar = new vri(new vql(vqeVar2, vroVar, i, 1));
            } else {
                c = 0;
                vriVar = null;
            }
            ret retVar2 = (ret) repVar.b.f();
            if (retVar2 != null) {
                Drawable drawable3 = retVar2.a;
                if (drawable3 != null) {
                    boolean z2 = retVar2.c;
                    String str2 = (String) retVar2.d.f();
                    vorVar = new voq(drawable3, z2, str2 != null ? new vos(str2) : null);
                } else {
                    int i2 = retVar2.b;
                    boolean z3 = retVar2.c;
                    String str3 = (String) retVar2.d.f();
                    vorVar = new vor(i2, z3, str3 != null ? new vos(str3) : null);
                }
                vrhVar = new vrh(vorVar, 2);
            } else {
                vrhVar = null;
            }
            vre[] vreVarArr = new vre[2];
            vreVarArr[c] = vrhVar;
            vreVarArr[1] = vriVar;
            vreVarAn = vxr.an(vreVarArr, 1);
        }
        if (vreVarAn != null && vrhVar2 != null) {
            throw new IllegalArgumentException("TextualCard can't show both TrailingTitleData and TrailingImageData");
        }
        vre[] vreVarArr2 = new vre[3];
        vreVarArr2[c] = vrhVar2;
        vreVarArr2[1] = vreVarAn;
        vreVarArr2[2] = null;
        vre vreVarAn2 = vxr.an(vreVarArr2, 2);
        ImmutableList immutableList = (ImmutableList) remVar.m.a();
        vpn vpnVarD = immutableList != null ? d(immutableList, this.i, remVar.w.b) : null;
        ImmutableList immutableList2 = (ImmutableList) remVar.q.a();
        return new rdp(new vqs(new vrd(vraVar, vqlVar, vqlVar2, null, vreVarAn2, vpnVarD, immutableList2 != null ? d(immutableList2, this.j, remVar.w.c) : null, 1, 0, 1560), Integer.valueOf(this.g), vro.SURFACE_CONTAINER_LOWEST, this.h, (yjk) null, remVar.g, 16));
    }

    public void b() {
        yjv yjvVar = this.c;
        rdl rdlVar = new rdl(yjvVar, 0);
        rem remVar = this.f;
        remVar.q(rdlVar);
        remVar.c.e(new rdl(this.k, 0));
        remVar.j.e(new rdl(yjvVar, 0));
        remVar.k.e(new rdl(yjvVar, 0));
        remVar.l.e(new rdl(yjvVar, 0));
        remVar.p.e(new rdl(yjvVar, 0));
        remVar.t.e(new rdl(yjvVar, 0));
        remVar.m.e(new rdl(yjvVar, 0));
        remVar.o.e(new rdl(this.l, 0));
        remVar.q.e(new rdl(yjvVar, 0));
        remVar.r.e(new rdl(this.m, 0));
    }

    public void c() {
        yjv yjvVar = this.c;
        rdl rdlVar = new rdl(yjvVar, 0);
        rem remVar = this.f;
        remVar.e(rdlVar);
        remVar.c.i(new rdl(this.k, 0));
        remVar.j.i(new rdl(yjvVar, 0));
        remVar.k.i(new rdl(yjvVar, 0));
        remVar.l.i(new rdl(yjvVar, 0));
        remVar.p.i(new rdl(yjvVar, 0));
        remVar.t.i(new rdl(yjvVar, 0));
        remVar.m.i(new rdl(yjvVar, 0));
        remVar.o.i(new rdl(this.l, 0));
        remVar.q.i(new rdl(yjvVar, 0));
        remVar.r.i(new rdl(this.m, 0));
        qyx qyxVar = new qyx(3);
        vrs vrsVar = this.d;
        vrsVar.c(this.h, qyxVar);
        vrsVar.c(this.i, new qyx(4));
        vrsVar.c(this.j, new qyx(5));
    }
}
