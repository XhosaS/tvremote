package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wxc {
    public final wxp a;
    public final agow b;
    public final wwc c;
    public final int d = 2;

    public wxc(wxp wxpVar, final agow agowVar, Set set) {
        this.a = wxpVar;
        this.c = wwc.c(set);
        this.b = new agow() { // from class: www
            @Override // defpackage.agow
            public final Object a() {
                return wwc.d(wwc.c((Set) agowVar.a()), this.a.c);
            }
        };
    }

    public final wvl a(String str) {
        return b(str, "", "", 0);
    }

    public final wvl b(String str, String str2, String str3, int i) {
        return this.a.b(str, (wwc) this.b.a(), this.d, str2, str3);
    }

    public final wvl c(String str, String str2, int i, long j, long j2) {
        return this.a.c((wwc) this.b.a(), j, j2, this.d, str, str2);
    }

    public final wvl d(String str, String str2, int i, String str3, wwc wwcVar) {
        return this.a.b(str3, wwc.d((wwc) this.b.a(), wwcVar), this.d, str, str2);
    }

    public final wwt e(String str, String str2, int i, String str3) {
        if (wum.t()) {
            return new wwt() { // from class: wwv
                @Override // defpackage.wwt, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }
            };
        }
        wxp wxpVar = this.a;
        agow agowVar = this.b;
        return wxpVar.d(str3, wwc.d((wwc) agowVar.a(), wwb.a), this.d, str, str2);
    }
}
