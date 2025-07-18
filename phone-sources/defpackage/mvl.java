package defpackage;

import android.os.Parcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class mvl implements Parcelable {
    public final String a;
    public final String b;
    public final List c;
    public final String d;

    public mvl() {
        throw null;
    }

    public static nag b() {
        nag nagVar = new nag();
        nagVar.h("");
        nagVar.d = "";
        nagVar.i(Collections.EMPTY_LIST);
        nagVar.j("");
        return nagVar;
    }

    public final String a(int i) {
        return ((mvm) this.c.get(i)).a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mvl) {
            mvl mvlVar = (mvl) obj;
            if (this.a.equals(mvlVar.a) && this.b.equals(mvlVar.b) && this.c.equals(mvlVar.c) && this.d.equals(mvlVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "OptionGroup{groupId=" + this.a + ", title=" + this.b + ", options=" + this.c.toString() + ", checkedId=" + this.d + "}";
    }

    public mvl(String str, String str2, List list, String str3) {
        if (str == null) {
            throw new NullPointerException("Null groupId");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null title");
        }
        this.b = str2;
        if (list == null) {
            throw new NullPointerException("Null options");
        }
        this.c = list;
        if (str3 == null) {
            throw new NullPointerException("Null checkedId");
        }
        this.d = str3;
    }
}
