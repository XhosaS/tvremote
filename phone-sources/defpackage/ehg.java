package defpackage;

import android.media.MediaCodec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehg {
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final dwi j;

    public ehg() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.j = new dwi(cryptoInfo);
    }
}
