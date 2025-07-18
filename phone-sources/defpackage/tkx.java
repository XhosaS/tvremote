package defpackage;

import android.net.Uri;
import android.util.Pair;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tkx extends tkm {
    public final Map a;
    private final InetAddress b;
    private final int d;
    private final String e;
    private final String f;

    public tkx(InetAddress inetAddress, int i, String str, String str2) {
        this.b = inetAddress;
        this.d = i == 6465 ? 6466 : i;
        this.e = str;
        this.f = str2;
        this.a = new HashMap();
    }

    @Override // defpackage.tkm
    public final Uri a() {
        return new Uri.Builder().scheme("tcp").encodedAuthority(this.b.getHostAddress() + ":" + this.d).encodedPath(this.e).fragment(this.f).build();
    }

    @Override // defpackage.tkm
    public final CharSequence b() {
        return this.f;
    }

    @Override // defpackage.tkm
    public final String c() {
        return new Uri.Builder().scheme("tcp").encodedAuthority(this.b.getHostAddress() + ":" + this.d).build().toString();
    }

    public final Boolean d() {
        return Boolean.valueOf(f() != null);
    }

    public final String e(String str) {
        return (String) this.a.get(str);
    }

    @Override // defpackage.tkm
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tkx)) {
            return false;
        }
        tkx tkxVar = (tkx) obj;
        return a.Q(this.b, tkxVar.b) && a.Q(this.e, tkxVar.e) && a.Q(this.f, tkxVar.f) && this.d == tkxVar.d;
    }

    public final String f() {
        return e("wp");
    }

    @Override // defpackage.tkm
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(this.d)});
    }

    public tkx(InetAddress inetAddress, int i, String str, String str2, Collection collection) {
        this(inetAddress, i, str, str2);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            this.a.put((String) pair.first, (String) pair.second);
        }
    }

    public tkx(InetAddress inetAddress, int i, String str, String str2, List list) {
        this(inetAddress, i, str, str2);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                int iIndexOf = str3.indexOf(61);
                if (iIndexOf >= 0) {
                    this.a.put(str3.substring(0, iIndexOf), str3.substring(iIndexOf + 1));
                }
            }
        }
    }
}
