package defpackage;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efh extends eem {
    private RandomAccessFile a;
    private Uri b;
    private long c;
    private boolean d;

    public efh() {
        super(false);
    }

    @Override // defpackage.dyu
    public final int a(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.c == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.a;
            String str = edt.a;
            int i3 = randomAccessFile.read(bArr, i, (int) Math.min(this.c, i2));
            if (i3 > 0) {
                this.c -= i3;
                g(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new efg(e, 2000);
        }
    }

    @Override // defpackage.ees
    public final long b(eey eeyVar) throws IOException {
        Uri uri = eeyVar.a;
        this.b = uri;
        i(eeyVar);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.a = randomAccessFile;
            try {
                long j = eeyVar.f;
                randomAccessFile.seek(j);
                long length = eeyVar.g;
                if (length == -1) {
                    length = this.a.length() - j;
                }
                this.c = length;
                if (length < 0) {
                    throw new efg(null, null, 2008);
                }
                this.d = true;
                j(eeyVar);
                return this.c;
            } catch (IOException e) {
                throw new efg(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new efg(e2, ((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new efg(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, 1004);
        } catch (SecurityException e3) {
            throw new efg(e3, 2006);
        } catch (RuntimeException e4) {
            throw new efg(e4, 2000);
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
                RandomAccessFile randomAccessFile = this.a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.a = null;
                if (this.d) {
                    this.d = false;
                    h();
                }
            } catch (IOException e) {
                throw new efg(e, 2000);
            }
        } catch (Throwable th) {
            this.a = null;
            if (this.d) {
                this.d = false;
                h();
            }
            throw th;
        }
    }
}
