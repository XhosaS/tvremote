package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface hlg {
    public static final Charset a = Charset.forName("UTF-8");

    void a(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
