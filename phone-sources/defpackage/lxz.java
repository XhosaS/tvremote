package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lxz implements lxy {
    public static final idf a = new lxq(2);
    public final String b;
    public final Locale c;
    public final String d = null;
    public final String e = null;
    public final String f;
    public final String g;
    public final boolean h;

    public lxz(ieg iegVar, String str, Locale locale, String str2) {
        this.g = ksn.c(iegVar);
        this.h = iegVar.m();
        this.b = str;
        this.c = locale;
        this.f = str2;
    }

    @Override // defpackage.lxy
    public final String a() {
        return this.g;
    }

    @Override // defpackage.lxy
    public final boolean b() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lxz lxzVar = (lxz) obj;
        if (this.h == lxzVar.h && this.b.equals(lxzVar.b) && this.c.equals(lxzVar.c) && this.f.equals(lxzVar.f)) {
            return this.g.equals(lxzVar.g);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.b.hashCode() * 31) + this.c.hashCode()) * 29791) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + (this.h ? 1 : 0);
    }
}
