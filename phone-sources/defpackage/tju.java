package defpackage;

import android.net.Uri;
import java.net.InetAddress;
import java.util.Collection;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tju {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public tju(idf idfVar, mem memVar, kuw kuwVar, mbk mbkVar, ksy ksyVar, int i, Uri uri) {
        this.f = kuwVar;
        this.g = idfVar;
        this.b = memVar;
        this.e = mbkVar;
        this.c = ksyVar;
        this.a = i;
        this.d = uri;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    public final int a() {
        int i = 0;
        while (true) {
            ?? r2 = this.e;
            if (i >= r2.size()) {
                return -1;
            }
            int[] iArr = (int[]) r2.get(i);
            if (iArr[2] - iArr[0] == iArr[3] - iArr[1]) {
                return i;
            }
            i++;
        }
    }

    public tju(String str, String str2, Collection collection, int i, String str3, Locale locale, String str4) {
        this.d = str;
        this.g = str2;
        this.e = krh.h(collection);
        this.a = i;
        this.c = str3;
        this.b = locale;
        this.f = str4;
    }

    public tju(InetAddress inetAddress, int i, tig tigVar, zft zftVar, String str, String str2) {
        this.b = inetAddress;
        this.a = i;
        this.c = tigVar;
        this.g = zftVar;
        this.d = str;
        this.e = str2;
        this.f = new tjt(this);
    }
}
