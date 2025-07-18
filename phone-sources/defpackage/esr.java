package defpackage;

import android.media.MediaCodec;

/* compiled from: PG */
/* loaded from: classes.dex */
public class esr extends ehi {
    public final String a;
    public final int b;

    public esr(Throwable th, ess essVar) {
        super("Decoder failed: ".concat(String.valueOf(essVar == null ? null : essVar.a)), th);
        boolean z = th instanceof MediaCodec.CodecException;
        this.a = z ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null;
        this.b = z ? ((MediaCodec.CodecException) th).getErrorCode() : 0;
    }
}
