package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bxx implements Iterator {
    final CharSequence b;
    final boolean c;
    final /* synthetic */ awo f;
    private Object g;
    public int a = 2;
    int d = 0;
    int e = Integer.MAX_VALUE;

    public bxx(byl bylVar, CharSequence charSequence, awo awoVar) {
        this.f = awoVar;
        this.c = bylVar.a;
        this.b = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int length;
        CharSequence charSequence;
        int i;
        bdq.j(this.a != 4);
        int i2 = this.a;
        int i3 = i2 - 1;
        String string = null;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            return true;
        }
        if (i3 != 2) {
            this.a = 4;
            int i4 = this.d;
            while (true) {
                length = this.d;
                if (length == -1) {
                    this.a = 3;
                    break;
                }
                charSequence = this.b;
                int length2 = charSequence.length();
                bdq.o(length, length2);
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (charSequence.charAt(length) == ((bxy) this.f).a) {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    length = charSequence.length();
                    this.d = -1;
                    i = -1;
                } else {
                    i = length + 1;
                    this.d = i;
                }
                if (i == i4) {
                    int i5 = i + 1;
                    this.d = i5;
                    if (i5 > charSequence.length()) {
                        this.d = -1;
                    }
                } else {
                    if (i4 < length) {
                        charSequence.charAt(i4);
                    }
                    if (i4 < length) {
                        charSequence.charAt(length - 1);
                    }
                    if (!this.c || i4 != length) {
                        break;
                    }
                    i4 = this.d;
                }
            }
            int i6 = this.e;
            if (i6 == 1) {
                length = charSequence.length();
                this.d = -1;
                if (length > i4) {
                    charSequence.charAt(length - 1);
                }
            } else {
                this.e = i6 - 1;
            }
            string = charSequence.subSequence(i4, length).toString();
            this.g = string;
            if (this.a != 3) {
                this.a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = 2;
        Object obj = this.g;
        this.g = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
