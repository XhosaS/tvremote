package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nag {
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public nag() {
    }

    public final void a(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.a = uri;
    }

    public final void b(lio lioVar) {
        if (lioVar == null) {
            throw new NullPointerException("Null uiElementNode");
        }
        this.d = lioVar;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.CharSequence, java.lang.Object] */
    public final myw c() {
        ?? r1;
        Object obj;
        Object obj2;
        Object obj3 = this.b;
        if (obj3 != null && (r1 = this.d) != 0 && (obj = this.a) != null && (obj2 = this.c) != null) {
            return new myw((String) obj3, r1, (String) obj, (ieg) obj2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" title");
        }
        if (this.d == null) {
            sb.append(" description");
        }
        if (this.a == null) {
            sb.append(" contentRatingId");
        }
        if (this.c == null) {
            sb.append(" tomatometerModelResult");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void d(CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("Null description");
        }
        this.d = charSequence;
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.b = str;
    }

    public final void f(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null tomatometerModelResult");
        }
        this.c = iegVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final mvl g() {
        Object obj;
        ?? r2;
        Object obj2;
        Object obj3 = this.d;
        if (obj3 != null && (obj = this.a) != null && (r2 = this.b) != 0 && (obj2 = this.c) != null) {
            return new mvf((String) obj3, (String) obj, r2, (String) obj2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" groupId");
        }
        if (this.a == null) {
            sb.append(" title");
        }
        if (this.b == null) {
            sb.append(" options");
        }
        if (this.c == null) {
            sb.append(" checkedId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null checkedId");
        }
        this.c = str;
    }

    public final void i(List list) {
        if (list == null) {
            throw new NullPointerException("Null options");
        }
        this.b = list;
    }

    public final void j(String str) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.a = str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.CharSequence, java.lang.Object] */
    public final mul k() {
        ?? r0 = this.a;
        if (r0 == 0) {
            throw new IllegalStateException("Missing required properties: title");
        }
        return new mul(r0, this.c, (sdk) this.d, (tst) this.b);
    }

    public final void l(CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("Null title");
        }
        this.a = charSequence;
    }

    public final lry m() {
        Object obj;
        Object obj2;
        Object obj3 = this.b;
        if (obj3 != null && (obj = this.d) != null && (obj2 = this.c) != null) {
            return new lry((ksy) obj3, (ieg) obj, (lbh) obj2, (tst) this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" assetId");
        }
        if (this.d == null) {
            sb.append(" account");
        }
        if (this.c == null) {
            sb.append(" hdcpLevel");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void n(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null account");
        }
        this.d = iegVar;
    }

    public final void o(ksy ksyVar) {
        if (ksyVar == null) {
            throw new NullPointerException("Null assetId");
        }
        this.b = ksyVar;
    }

    public final void p(lbh lbhVar) {
        if (lbhVar == null) {
            throw new NullPointerException("Null hdcpLevel");
        }
        this.c = lbhVar;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Set] */
    public final kva q() {
        if (this.a != null && this.d != null && this.b != null && this.c != null) {
            return new kva(this.a, this.d, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" libraryItems");
        }
        if (this.d == null) {
            sb.append(" showLibraryItems");
        }
        if (this.b == null) {
            sb.append(" partiallyPurchasedSeasons");
        }
        if (this.c == null) {
            sb.append(" partiallyPurchasedShows");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void r(Map map) {
        if (map == null) {
            throw new NullPointerException("Null libraryItems");
        }
        this.a = map;
    }

    public final void s(Set set) {
        if (set == null) {
            throw new NullPointerException("Null partiallyPurchasedSeasons");
        }
        this.b = set;
    }

    public final void t(Set set) {
        if (set == null) {
            throw new NullPointerException("Null partiallyPurchasedShows");
        }
        this.c = set;
    }

    public final void u(Map map) {
        if (map == null) {
            throw new NullPointerException("Null showLibraryItems");
        }
        this.d = map;
    }

    public final kqz v() {
        Object obj = this.c;
        if (obj == null) {
            throw new IllegalStateException("Missing required properties: referrer");
        }
        Object obj2 = this.d;
        return new kqz((String) obj, (tst) obj2, (tst) this.a, (tst) this.b);
    }

    public nag(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = trk.a;
    }

    public nag(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = trk.a;
    }

    public nag(byte[] bArr, byte[] bArr2, char[] cArr) {
        trk trkVar = trk.a;
        this.d = trkVar;
        this.a = trkVar;
        this.b = trkVar;
    }
}
