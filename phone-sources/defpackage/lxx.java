package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lxx {
    private static final String[] d = {"m", "i", "b", "e", "r", "c", "t", "g", "o", "p", ":ANN", "n", ":HDP", ":RV", ":PRIM", ":COLLMD", ":PTTAG", ":DDD", ":SENT"};
    public String a;
    public Locale b;
    public String c;
    private final mew e;
    private final StringBuilder f = new StringBuilder();
    private int g;

    public lxx(String str) {
        this.e = new mew(str);
    }

    public final String a() {
        mew mewVar = this.e;
        mewVar.j("cr");
        if (!TextUtils.isEmpty(this.a)) {
            mewVar.l("cr", this.a);
        }
        mewVar.j("lr");
        Locale locale = this.b;
        if (locale != null && !TextUtils.isEmpty(locale.getLanguage())) {
            mewVar.l("lr", this.b.getLanguage());
            if (!TextUtils.isEmpty(this.b.getCountry())) {
                String country = this.b.getCountry();
                String strB = mewVar.b("lr", "-._~!$'()*+,:@/?");
                String strB2 = country == null ? "" : mewVar.b(country, "-._~!$'()*+,=:@/?");
                String strB3 = mewVar.b("-", "-._~!$'()*+,=:@/?");
                mewVar.f(mewVar.b + 1, strB);
                if (mewVar.d == -1) {
                    mewVar.c(strB, strB2);
                } else {
                    int length = strB2.length() + strB3.length();
                    StringBuilder sb = mewVar.a;
                    mew.e(sb, length);
                    sb.insert(mewVar.e, strB3).insert(mewVar.e + strB3.length(), strB2);
                    mewVar.c += length;
                }
            }
        }
        mewVar.j("mrf");
        mewVar.j("tvrf");
        mewVar.j("exp");
        if (!TextUtils.isEmpty(this.c)) {
            mewVar.l("exp", this.c);
        }
        mewVar.j("resid");
        if (!TextUtils.isEmpty(null)) {
            mewVar.l("resid", null);
        }
        mewVar.j("utoken");
        if (!TextUtils.isEmpty(null)) {
            mewVar.l("utoken", null);
        }
        mewVar.j("fs");
        mewVar.j("if");
        StringBuilder sb2 = this.f;
        int i = this.g;
        for (int i2 = 0; i2 < 19; i2++) {
            if (((1 << i2) & i) != 0) {
                sb2.append(d[i2]);
            }
        }
        if (sb2.length() != 0) {
            mewVar.l("if", sb2.toString());
        }
        return mewVar.a();
    }

    public final void b(int i) {
        this.g = i | this.g;
    }

    public final void c(String str, String str2) {
        this.e.h(str, str2);
    }

    public final void d(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.e.h(str, (String) it.next());
        }
    }

    public final void e(lxz lxzVar) {
        this.a = lxzVar.b;
        this.b = lxzVar.c;
        String str = lxzVar.d;
        String str2 = lxzVar.e;
    }
}
