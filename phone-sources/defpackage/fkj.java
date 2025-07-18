package defpackage;

import com.google.common.collect.ImmutableSet;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fkj {
    public static final Pattern a = Pattern.compile("\\s+");
    public static final ImmutableSet b = ImmutableSet.of("auto", "none");
    public static final ImmutableSet c = ImmutableSet.of("dot", "sesame", "circle");
    public static final ImmutableSet d = ImmutableSet.of("filled", "open");
    public static final ImmutableSet e = ImmutableSet.of("after", "before", "outside");
    public final int f;
    public final int g;
    public final int h;

    public fkj(int i, int i2, int i3) {
        this.f = i;
        this.g = i2;
        this.h = i3;
    }
}
