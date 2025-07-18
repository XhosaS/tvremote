package defpackage;

import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hr {
    public final Signature a;
    public final Cipher b;
    public final Mac c;
    public final IdentityCredential d;
    public final PresentationSession e;
    public final long f;

    public hr(long j) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = j;
    }

    @Deprecated
    public hr(IdentityCredential identityCredential) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = identityCredential;
        this.e = null;
        this.f = 0L;
    }

    public hr(PresentationSession presentationSession) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = presentationSession;
        this.f = 0L;
    }

    public hr(Signature signature) {
        this.a = signature;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = 0L;
    }

    public hr(Cipher cipher) {
        this.a = null;
        this.b = cipher;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = 0L;
    }

    public hr(Mac mac) {
        this.a = null;
        this.b = null;
        this.c = mac;
        this.d = null;
        this.e = null;
        this.f = 0L;
    }
}
