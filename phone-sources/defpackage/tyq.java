package defpackage;

import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tyq {
    private tyq() {
    }

    public static void a(String str, Object... objArr) {
        System.err.println(tyq.class.toString() + ": " + String.format(str, objArr));
    }

    public static boolean b(char c) {
        if (c < 'a' || c > 'z') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    public static void c(File file) throws IOException {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    public static /* synthetic */ uca d(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (uca) vucVarO;
    }

    public static void e(wjc wjcVar, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uca ucaVar = (uca) vtwVar.b;
        uca ucaVar2 = uca.a;
        ucaVar.c = wjcVar;
        ucaVar.b |= 1;
    }

    public static void f(ubt ubtVar, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uca ucaVar = (uca) vtwVar.b;
        uca ucaVar2 = uca.a;
        ucaVar.d = ubtVar;
        ucaVar.b |= 2;
    }

    public static /* synthetic */ ubz g(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (ubz) vucVarO;
    }

    public static void h(uby ubyVar, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        ubz ubzVar = (ubz) vtwVar.b;
        ubz ubzVar2 = ubz.a;
        ubzVar.d = ubyVar;
        ubzVar.b |= 2;
    }

    public static void i(uca ucaVar, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        ubz ubzVar = (ubz) vtwVar.b;
        ubz ubzVar2 = ubz.a;
        ubzVar.c = ucaVar;
        ubzVar.b |= 1;
    }

    public static /* synthetic */ uby j(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (uby) vucVarO;
    }

    public static void k(wji wjiVar, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uby ubyVar = (uby) vtwVar.b;
        uby ubyVar2 = uby.a;
        ubyVar.c = wjiVar;
        ubyVar.b |= 1;
    }

    public static void l(ubk ubkVar, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uby ubyVar = (uby) vtwVar.b;
        uby ubyVar2 = uby.a;
        ubyVar.d = ubkVar;
        ubyVar.b |= 2;
    }

    public tyq(char[] cArr) {
    }
}
