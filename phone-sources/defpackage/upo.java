package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class upo {
    public final Object a;

    public upo(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public static int i(vvd vvdVar, Object obj, Object obj2) {
        return vtr.a((vwo) vvdVar.c, 1, obj) + vtr.a((vwo) vvdVar.d, 2, obj2);
    }

    public static void j(vtj vtjVar, vvd vvdVar, Object obj, Object obj2) {
        vtr.g(vtjVar, (vwo) vvdVar.c, 1, obj);
        vtr.g(vtjVar, (vwo) vvdVar.d, 2, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xso] */
    public final byte[] a(Object obj) {
        try {
            return vsz.t(this.a.a(obj)).w();
        } catch (IOException e) {
            throw new RuntimeException("Could not serialize proto", e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ybv] */
    public final ybx b() {
        return new ybx(this.a);
    }

    public final long c(long j) {
        return ((AtomicLong) this.a).addAndGet(j);
    }

    public final void d(Object obj, xcq xcqVar) {
        obj.getClass();
        xcqVar.getClass();
        ((LinkedHashMap) this.a).put(obj, xcqVar);
    }

    public final /* synthetic */ vwv e() {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((wom) ((vtw) this.a).b).c);
        listUnmodifiableList.getClass();
        return new vwv(listUnmodifiableList);
    }

    public final /* synthetic */ wom f() {
        vuc vucVarO = ((vtw) this.a).r();
        vucVarO.getClass();
        return (wom) vucVarO;
    }

    public final /* synthetic */ void g(vwv vwvVar, Iterable iterable) {
        vwvVar.getClass();
        iterable.getClass();
        vtw vtwVar = (vtw) this.a;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wom womVar = (wom) vtwVar.b;
        wom womVar2 = wom.a;
        womVar.c();
        vsf.h(iterable, womVar.c);
    }

    public final /* synthetic */ void h(wkx wkxVar) {
        vtw vtwVar = (vtw) this.a;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wom womVar = (wom) vtwVar.b;
        wom womVar2 = wom.a;
        womVar.c();
        womVar.c.add(wkxVar);
    }

    public upo(vwo vwoVar, Object obj, vwo vwoVar2, Object obj2) {
        this.a = new vvd(vwoVar, obj, vwoVar2, obj2);
    }

    public upo(int i) {
        this.a = wae.v(i);
    }

    public upo(xtk xtkVar, xsm xsmVar) {
        xtkVar.getClass();
        this.a = xtkVar;
        xsmVar.getClass();
    }

    public upo(char[] cArr) {
        this.a = new AtomicLong();
    }

    public upo() {
        this.a = vyf.R(-1, 0, 6);
    }

    public upo(Object obj) {
        obj.getClass();
        this.a = obj;
    }
}
