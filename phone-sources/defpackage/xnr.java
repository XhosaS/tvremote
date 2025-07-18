package defpackage;

import com.google.common.collect.ImmutableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xnr {
    public static volatile String a;
    public static final rzy b;
    private static final ryq c;

    static {
        yau yauVar = new yau((tsl) new uhe(14));
        yauVar.e(ImmutableSet.of("ANDROID_GMAIL", "GMAIL_ANDROID", "GMAIL_ANDROID_PRIMES", "GMM_PRIMES", "KEEP_ANDROID_PRIMES", "PEOPLE_AUTOCOMPLETE", "PEOPLE_INTELLIGENCE", "PHOTOS", "PHOTOS_ANDROID_PRIMES", "SENDKIT", "SOCIAL_AFFINITY", "SOCIAL_AFFINITY_PHOTOS"));
        ryq ryqVarD = yauVar.d();
        c = ryqVarD;
        b = new rzy("com.google.android.libraries.social.peoplekit", ryqVarD);
        a = null;
    }

    private xnr() {
    }
}
