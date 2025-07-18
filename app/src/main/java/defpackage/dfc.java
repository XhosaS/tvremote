package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes.dex */
class dfc implements dqq {
    @Override // defpackage.dqq
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final dfd a() {
        try {
            return new dfd(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
