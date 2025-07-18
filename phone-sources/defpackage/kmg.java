package defpackage;

import android.app.Activity;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmg {
    public final mab a;
    public final izo b;
    public kmd c;
    public hia d;
    public hio e;
    public kme f;
    public jde g;

    public kmg(mab mabVar, izo izoVar) {
        mabVar.getClass();
        izoVar.getClass();
        this.a = mabVar;
        this.b = izoVar;
    }

    public final void a() {
        hia hiaVar = this.d;
        if (hiaVar != null) {
            hiaVar.h();
        }
        this.d = null;
    }

    public final void b(Activity activity) {
        hia hiaVar = this.d;
        byte[] bArr = null;
        hij hijVarE = hiaVar != null ? hiaVar.e("iii") : null;
        hia hiaVar2 = this.d;
        hij hijVarE2 = hiaVar2 != null ? hiaVar2.e("hhh") : null;
        if ((hijVarE == null || hijVarE.a != 0) && (hijVarE2 == null || hijVarE2.a != 0)) {
            jde jdeVar = this.g;
            if (jdeVar != null) {
                jdeVar.a(-2, new UnsupportedOperationException("Operation not supported"));
            }
            a();
            return;
        }
        kvw kvwVar = new kvw((char[]) null);
        kmd kmdVar = this.c;
        if (kmdVar == null) {
            yks.c("product");
            kmdVar = null;
        }
        kvwVar.b = kmdVar.a.b;
        kmd kmdVar2 = this.c;
        if (kmdVar2 == null) {
            yks.c("product");
            kmdVar2 = null;
        }
        kvwVar.c = kmdVar2.b;
        kvwVar.a = "first_party";
        if ("first_party".equals(kvwVar.a)) {
            if (kvwVar.c == null) {
                throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
            }
        } else {
            if (kvwVar.b == null) {
                throw new IllegalArgumentException("Product id must be provided.");
            }
            if (kvwVar.a == null) {
                throw new IllegalArgumentException("Product type must be provided.");
            }
        }
        ImmutableList immutableListOf = ImmutableList.of(new cvi(kvwVar));
        immutableListOf.getClass();
        nxb nxbVar = new nxb();
        if (immutableListOf.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
        HashSet hashSet = new HashSet();
        Iterator<E> it = immutableListOf.iterator();
        while (it.hasNext()) {
            Object obj = ((cvi) it.next()).a;
            if (!"play_pass_subs".equals(obj)) {
                hashSet.add(obj);
            }
        }
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        nxbVar.a = ImmutableList.copyOf((Collection) immutableListOf);
        if (nxbVar.a == null) {
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }
        hfx hfxVar = new hfx(nxbVar);
        hia hiaVar3 = this.d;
        if (hiaVar3 != null) {
            hiaVar3.w(hfxVar, new kmf(this, activity, bArr));
        }
    }
}
