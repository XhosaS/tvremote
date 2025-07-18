package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lvg {
    private ImmutableList a;
    private ImmutableList b;
    private ImmutableList c;
    private int d;
    private String e;
    private byte f;

    public final lvh a() {
        ImmutableList immutableList;
        ImmutableList immutableList2;
        ImmutableList immutableList3;
        String str;
        if (this.f == 1 && (immutableList = this.a) != null && (immutableList2 = this.b) != null && (immutableList3 = this.c) != null && (str = this.e) != null) {
            return new lvh(immutableList, immutableList2, immutableList3, this.d, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" mediaStreams");
        }
        if (this.b == null) {
            sb.append(" captions");
        }
        if (this.c == null) {
            sb.append(" storyboards");
        }
        if (this.f == 0) {
            sb.append(" dubCardType");
        }
        if (this.e == null) {
            sb.append(" dubCardLanguage");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(List list) {
        this.b = ImmutableList.copyOf((Collection) list);
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null dubCardLanguage");
        }
        this.e = str;
    }

    public final void d(int i) {
        this.d = i;
        this.f = (byte) 1;
    }

    public final void e(List list) {
        this.a = ImmutableList.copyOf((Collection) list);
    }

    public final void f(List list) {
        this.c = ImmutableList.copyOf((Collection) list);
    }
}
