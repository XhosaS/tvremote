package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import j$.nio.channels.DesugarChannels;
import j$.util.Objects;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eeo extends eem {
    private final ContentResolver a;
    private Uri b;
    private AssetFileDescriptor c;
    private FileInputStream d;
    private long e;
    private boolean f;

    public eeo(Context context) {
        super(false);
        this.a = context.getContentResolver();
    }

    @Override // defpackage.dyu
    public final int a(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new een(e, 2000);
            }
        }
        FileInputStream fileInputStream = this.d;
        String str = edt.a;
        int i3 = fileInputStream.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        long j2 = this.e;
        if (j2 != -1) {
            this.e = j2 - i3;
        }
        g(i3);
        return i3;
    }

    @Override // defpackage.ees
    public final long b(eey eeyVar) throws IOException {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        try {
            try {
                Uri uriNormalizeScheme = eeyVar.a.normalizeScheme();
                this.b = uriNormalizeScheme;
                i(eeyVar);
                if (Objects.equals(uriNormalizeScheme.getScheme(), "content")) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = this.a.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = this.a.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.c = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new een(new IOException(a.ct(uriNormalizeScheme, "Could not open file descriptor for: ")), 2000);
                    } catch (IOException e) {
                        e = e;
                        throw new een(e, true != (e instanceof FileNotFoundException) ? i : 2005);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.d = fileInputStream;
                if (length != -1 && eeyVar.f > length) {
                    throw new een(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long j = eeyVar.f;
                long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
                if (jSkip != j) {
                    throw new een(null, 2008);
                }
                if (length == -1) {
                    FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                    long size = fileChannelConvertMaybeLegacyFileChannelFromLibrary.size();
                    if (size == 0) {
                        this.e = -1L;
                        jPosition = -1;
                    } else {
                        jPosition = size - fileChannelConvertMaybeLegacyFileChannelFromLibrary.position();
                        this.e = jPosition;
                        if (jPosition < 0) {
                            throw new een(null, 2008);
                        }
                    }
                } else {
                    jPosition = length - jSkip;
                    this.e = jPosition;
                    if (jPosition < 0) {
                        throw new een(null, 2008);
                    }
                }
                long j2 = eeyVar.g;
                if (j2 != -1) {
                    this.e = jPosition == -1 ? j2 : Math.min(jPosition, j2);
                }
                this.f = true;
                j(eeyVar);
                return j2 != -1 ? j2 : this.e;
            } catch (IOException e2) {
                e = e2;
                i = 2000;
            }
        } catch (een e3) {
            throw e3;
        }
    }

    @Override // defpackage.ees
    public final Uri c() {
        return this.b;
    }

    @Override // defpackage.ees
    public final void d() {
        this.b = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream = this.d;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    this.d = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.c;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.c = null;
                        if (this.f) {
                            this.f = false;
                            h();
                        }
                    } catch (IOException e) {
                        throw new een(e, 2000);
                    }
                } catch (IOException e2) {
                    throw new een(e2, 2000);
                }
            } catch (Throwable th) {
                this.c = null;
                if (this.f) {
                    this.f = false;
                    h();
                }
                throw th;
            }
        } catch (Throwable th2) {
            this.d = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.c;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.c = null;
                if (this.f) {
                    this.f = false;
                    h();
                }
                throw th2;
            } catch (IOException e3) {
                throw new een(e3, 2000);
            }
        }
    }
}
