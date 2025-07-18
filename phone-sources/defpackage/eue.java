package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eue {
    public List a;
    public byte[] b;
    public String c;
    public byte[] d;
    private final String e;
    private final Uri f;
    private String g;

    public eue(String str, Uri uri) {
        this.e = str;
        this.f = uri;
    }

    public final euh a() {
        String str = this.g;
        List listOf = this.a;
        if (listOf == null) {
            listOf = ImmutableList.of();
        }
        List list = listOf;
        return new euh(this.e, this.f, str, list, this.b, this.c, this.d, null, null);
    }

    public final void b(String str) {
        this.g = eae.i(str);
    }
}
