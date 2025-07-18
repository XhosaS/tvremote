package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.bxy;
import defpackage.nhv;
import defpackage.nje;
import defpackage.njo;
import defpackage.nwi;
import defpackage.ocg;
import defpackage.ocv;
import defpackage.ydk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class GoogleSignInOptions extends ocg implements ReflectedParcelable, nwi {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final Scope a;
    public static final Scope b;
    public static final Scope c;
    public static final Scope d;
    public static final GoogleSignInOptions e;
    public static final Comparator f;
    final int g;
    public final ArrayList h;
    public final Account i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final String n;
    public final ArrayList o;
    public final String p;

    static {
        Scope scope = new Scope("profile");
        a = scope;
        new Scope("email");
        b = new Scope("openid");
        Scope scope2 = new Scope("https://www.googleapis.com/auth/games_lite");
        c = scope2;
        d = new Scope("https://www.googleapis.com/auth/games");
        nje njeVar = new nje();
        njeVar.b();
        njeVar.a.add(scope);
        e = njeVar.a();
        nje njeVar2 = new nje();
        njeVar2.c(scope2, new Scope[0]);
        njeVar2.a();
        CREATOR = new nhv(9);
        f = new bxy(16);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3) {
        this.g = i;
        this.h = arrayList;
        this.i = account;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = str;
        this.n = str2;
        this.o = new ArrayList(map.values());
        this.p = str3;
    }

    public static Map b(List list) {
        HashMap map = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                njo njoVar = (njo) it.next();
                map.put(Integer.valueOf(njoVar.b), njoVar);
            }
        }
        return map;
    }

    public final ArrayList a() {
        return new ArrayList(this.h);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004b A[Catch: ClassCastException -> 0x007b, TryCatch #0 {ClassCastException -> 0x007b, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0017, B:12:0x0027, B:15:0x0032, B:17:0x0036, B:22:0x0043, B:24:0x004b, B:30:0x005d, B:32:0x0063, B:34:0x0069, B:36:0x006f, B:27:0x0054, B:20:0x003b), top: B:42:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054 A[Catch: ClassCastException -> 0x007b, TryCatch #0 {ClassCastException -> 0x007b, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0017, B:12:0x0027, B:15:0x0032, B:17:0x0036, B:22:0x0043, B:24:0x004b, B:30:0x005d, B:32:0x0063, B:34:0x0069, B:36:0x006f, B:27:0x0054, B:20:0x003b), top: B:42:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r5 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r5     // Catch: java.lang.ClassCastException -> L7b
            java.util.ArrayList r1 = r4.o     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L7b
            if (r1 == 0) goto L7b
            java.util.ArrayList r1 = r5.o     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L7b
            if (r1 != 0) goto L17
            goto L7b
        L17:
            java.util.ArrayList r1 = r4.h     // Catch: java.lang.ClassCastException -> L7b
            int r2 = r1.size()     // Catch: java.lang.ClassCastException -> L7b
            java.util.ArrayList r3 = r5.a()     // Catch: java.lang.ClassCastException -> L7b
            int r3 = r3.size()     // Catch: java.lang.ClassCastException -> L7b
            if (r2 != r3) goto L7b
            java.util.ArrayList r2 = r5.a()     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L7b
            if (r1 != 0) goto L32
            goto L7b
        L32:
            android.accounts.Account r1 = r4.i     // Catch: java.lang.ClassCastException -> L7b
            if (r1 != 0) goto L3b
            android.accounts.Account r1 = r5.i     // Catch: java.lang.ClassCastException -> L7b
            if (r1 != 0) goto L7b
            goto L43
        L3b:
            android.accounts.Account r2 = r5.i     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L7b
            if (r1 == 0) goto L7b
        L43:
            java.lang.String r1 = r4.m     // Catch: java.lang.ClassCastException -> L7b
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L7b
            if (r2 == 0) goto L54
            java.lang.String r1 = r5.m     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L7b
            if (r1 == 0) goto L7b
            goto L5d
        L54:
            java.lang.String r2 = r5.m     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L7b
            if (r1 != 0) goto L5d
            goto L7b
        L5d:
            boolean r1 = r4.l     // Catch: java.lang.ClassCastException -> L7b
            boolean r2 = r5.l     // Catch: java.lang.ClassCastException -> L7b
            if (r1 != r2) goto L7b
            boolean r1 = r4.j     // Catch: java.lang.ClassCastException -> L7b
            boolean r2 = r5.j     // Catch: java.lang.ClassCastException -> L7b
            if (r1 != r2) goto L7b
            boolean r1 = r4.k     // Catch: java.lang.ClassCastException -> L7b
            boolean r2 = r5.k     // Catch: java.lang.ClassCastException -> L7b
            if (r1 != r2) goto L7b
            java.lang.String r1 = r4.p     // Catch: java.lang.ClassCastException -> L7b
            java.lang.String r5 = r5.p     // Catch: java.lang.ClassCastException -> L7b
            boolean r5 = android.text.TextUtils.equals(r1, r5)     // Catch: java.lang.ClassCastException -> L7b
            if (r5 == 0) goto L7b
            r5 = 1
            return r5
        L7b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).b);
        }
        Collections.sort(arrayList);
        ydk ydkVar = new ydk((char[]) null, (byte[]) null);
        ydkVar.c(arrayList);
        ydkVar.c(this.i);
        ydkVar.c(this.m);
        ydkVar.b(this.l);
        ydkVar.b(this.j);
        ydkVar.b(this.k);
        ydkVar.c(this.p);
        return ydkVar.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, this.g);
        ocv.S(parcel, 2, a());
        ocv.N(parcel, 3, this.i, i);
        ocv.y(parcel, 4, this.j);
        ocv.y(parcel, 5, this.k);
        ocv.y(parcel, 6, this.l);
        ocv.O(parcel, 7, this.m);
        ocv.O(parcel, 8, this.n);
        ocv.S(parcel, 9, this.o);
        ocv.O(parcel, 10, this.p);
        ocv.x(parcel, iV);
    }
}
