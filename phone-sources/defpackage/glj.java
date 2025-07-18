package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glj {
    final ko a;
    final ko b;
    final ko c;
    public final Parcel d;
    private final SparseIntArray e;
    private final int f;
    private final int g;
    private final String h;
    private int i;
    private int j;
    private int k;

    public glj(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new ko(), new ko(), new ko());
    }

    private final Class v(Class cls) throws ClassNotFoundException {
        ko koVar = this.c;
        Class cls2 = (Class) koVar.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        koVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final int a(int i, int i2) {
        return !s(i2) ? i : this.d.readInt();
    }

    public final Parcelable b(Parcelable parcelable, int i) {
        if (!s(i)) {
            return parcelable;
        }
        return this.d.readParcelable(getClass().getClassLoader());
    }

    public final glk c() throws NoSuchMethodException, SecurityException {
        String strN = n();
        if (strN == null) {
            return null;
        }
        glj gljVarM = m();
        try {
            ko koVar = this.a;
            Method declaredMethod = (Method) koVar.get(strN);
            if (declaredMethod == null) {
                declaredMethod = Class.forName(strN, false, glj.class.getClassLoader()).getDeclaredMethod("read", glj.class);
                koVar.put(strN, declaredMethod);
            }
            return (glk) declaredMethod.invoke(null, gljVarM);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(e4);
        }
    }

    public final CharSequence d(CharSequence charSequence, int i) {
        if (!s(i)) {
            return charSequence;
        }
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.d);
    }

    public final String e(String str, int i) {
        return !s(i) ? str : n();
    }

    public final void f(boolean z, int i) {
        p(i);
        this.d.writeInt(z ? 1 : 0);
    }

    public final void g(CharSequence charSequence, int i) {
        p(i);
        TextUtils.writeToParcel(charSequence, this.d, 0);
    }

    public final void h(int i, int i2) {
        p(i2);
        q(i);
    }

    public final void i(Parcelable parcelable, int i) {
        p(i);
        this.d.writeParcelable(parcelable, 0);
    }

    public final void j(String str, int i) {
        p(i);
        r(str);
    }

    public final void k(glk glkVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (glkVar == null) {
            r(null);
            return;
        }
        try {
            r(v(glkVar.getClass()).getName());
            glj gljVarM = m();
            try {
                Class<?> cls = glkVar.getClass();
                ko koVar = this.b;
                Method declaredMethod = (Method) koVar.get(cls.getName());
                if (declaredMethod == null) {
                    declaredMethod = v(cls).getDeclaredMethod("write", cls, glj.class);
                    koVar.put(cls.getName(), declaredMethod);
                }
                declaredMethod.invoke(null, glkVar, gljVarM);
                gljVarM.o();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(e3);
            } catch (InvocationTargetException e4) {
                Throwable cause = e4.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (!(cause instanceof Error)) {
                    throw new RuntimeException(e4);
                }
                throw ((Error) cause);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(String.valueOf(glkVar.getClass().getSimpleName()).concat(" does not have a Parcelizer"), e5);
        }
    }

    public final boolean l(boolean z, int i) {
        return s(i) ? this.d.readInt() != 0 : z;
    }

    protected final glj m() {
        Parcel parcel = this.d;
        int iDataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        String str = this.h;
        return new glj(parcel, iDataPosition, i, str.concat("  "), this.a, this.b, this.c);
    }

    public final String n() {
        return this.d.readString();
    }

    public final void o() {
        int i = this.i;
        if (i >= 0) {
            SparseIntArray sparseIntArray = this.e;
            Parcel parcel = this.d;
            int i2 = sparseIntArray.get(i);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i2);
            parcel.writeInt(iDataPosition - i2);
            parcel.setDataPosition(iDataPosition);
        }
    }

    public final void p(int i) {
        o();
        this.i = i;
        this.e.put(i, this.d.dataPosition());
        q(0);
        q(i);
    }

    public final void q(int i) {
        this.d.writeInt(i);
    }

    public final void r(String str) {
        this.d.writeString(str);
    }

    public final boolean s(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            Parcel parcel = this.d;
            parcel.setDataPosition(this.j);
            int i3 = parcel.readInt();
            this.k = parcel.readInt();
            this.j += i3;
        }
        return this.k == i;
    }

    public final glk t(glk glkVar) {
        return !s(1) ? glkVar : c();
    }

    public final void u(glk glkVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        p(1);
        k(glkVar);
    }

    private glj(Parcel parcel, int i, int i2, String str, ko koVar, ko koVar2, ko koVar3) {
        this.a = koVar;
        this.b = koVar2;
        this.c = koVar3;
        this.e = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.d = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
