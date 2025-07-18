package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lvh {
    public final ImmutableList a;
    public final ImmutableList b;
    public final ImmutableList c;
    public final int d;
    public final String e;

    public lvh() {
        throw null;
    }

    public static lvg a() {
        lvg lvgVar = new lvg();
        lvgVar.e(ImmutableList.of());
        lvgVar.b(ImmutableList.of());
        lvgVar.f(ImmutableList.of());
        lvgVar.c("");
        lvgVar.d(0);
        return lvgVar;
    }

    public final boolean b() {
        return this.d == 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lvh) {
            lvh lvhVar = (lvh) obj;
            if (this.a.equals(lvhVar.a) && this.b.equals(lvhVar.b) && this.c.equals(lvhVar.c) && this.d == lvhVar.d && this.e.equals(lvhVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        ImmutableList immutableList = this.c;
        ImmutableList immutableList2 = this.b;
        return "Streams{mediaStreams=" + String.valueOf(this.a) + ", captions=" + String.valueOf(immutableList2) + ", storyboards=" + String.valueOf(immutableList) + ", dubCardType=" + this.d + ", dubCardLanguage=" + this.e + "}";
    }

    public lvh(ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, int i, String str) {
        this.a = immutableList;
        this.b = immutableList2;
        this.c = immutableList3;
        this.d = i;
        this.e = str;
    }
}
