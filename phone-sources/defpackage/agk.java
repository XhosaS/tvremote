package defpackage;

import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agk {
    public static final agk a = new agk(yhb.a);
    public final List b;

    public agk(List list) {
        this.b = list;
    }

    public final String toString() throws IOException {
        return "TextContextMenuData(components=" + cmq.d(this.b, "\n\t", "[\n\t", "\n]", null, 56) + ')';
    }
}
