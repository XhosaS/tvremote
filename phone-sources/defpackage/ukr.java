package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ukr extends uks {
    public ukr(List list) {
        super("Dependency cycle detected: ".concat(String.valueOf(Arrays.toString(list.toArray()))));
    }
}
