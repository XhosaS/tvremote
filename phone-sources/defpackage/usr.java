package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.common.collect.Sets;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class usr {
    public static volatile usr a;
    public final Object b;
    public final Object c;

    public usr(Intent intent) {
        this.c = new kwy((byte[]) null, (byte[]) null);
        this.b = intent;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    private final void g() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((usj) it.next()).c();
        }
    }

    public final SharedPreferences a() {
        return ((Context) this.b).getSharedPreferences("ServiceHostnameManagerImpl", 0);
    }

    public final void b(usp uspVar) {
        a.ab(a().edit().remove(uspVar.a()).commit());
        g();
    }

    public final void c(usp uspVar, String str) {
        a.ab(a().edit().putString(uspVar.a(), str).commit());
        g();
    }

    public final onz d() {
        return (onz) ((kwy) this.c).a;
    }

    public final void e() {
        ((kwy) this.c).w(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final synchronized onz f(String str, uoo uooVar) {
        ?? r0 = this.b;
        onz onzVar = (onz) r0.get(str);
        if (onzVar != null) {
            return onzVar;
        }
        Object obj = uooVar.a;
        Object obj2 = uooVar.b;
        Object obj3 = uooVar.c;
        uoq uoqVar = ((FirebaseMessaging) obj).e;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) obj;
        onz onzVarB = uoq.b(uoqVar.a(qtl.aO(uoqVar.a), "*", new Bundle())).c(((FirebaseMessaging) obj).f, new uon(firebaseMessaging, (String) obj2, (uoy) obj3, 0)).b(this.c, new nuy(this, str, 4, null));
        r0.put(str, onzVarB);
        return onzVarB;
    }

    public usr(Context context) {
        this.c = Sets.newIdentityHashSet();
        this.b = context;
    }

    public usr(Executor executor) {
        this.b = new ir();
        this.c = executor;
    }

    public usr(xtk xtkVar, xsm xsmVar) {
        sij.x(!xtkVar.g(), "Error status must not be OK");
        this.c = xtkVar;
        this.b = xsmVar;
    }
}
