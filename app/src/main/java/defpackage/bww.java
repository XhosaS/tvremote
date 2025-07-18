package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bww {
    final wx a;
    final wx b;
    final wx c;

    public bww(wx wxVar, wx wxVar2, wx wxVar3) {
        this.a = wxVar;
        this.b = wxVar2;
        this.c = wxVar3;
    }

    private final Class G(Class cls) throws ClassNotFoundException {
        wx wxVar = this.c;
        Class cls2 = (Class) wxVar.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        wxVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final void A(bwy bwyVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (bwyVar == null) {
            y(null);
            return;
        }
        try {
            y(G(bwyVar.getClass()).getName());
            bww bwwVarH = h();
            try {
                Class<?> cls = bwyVar.getClass();
                wx wxVar = this.b;
                Method declaredMethod = (Method) wxVar.get(cls.getName());
                if (declaredMethod == null) {
                    declaredMethod = G(cls).getDeclaredMethod("write", cls, bww.class);
                    wxVar.put(cls.getName(), declaredMethod);
                }
                declaredMethod.invoke(null, bwyVar, bwwVarH);
                bwwVarH.o();
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
            throw new RuntimeException(String.valueOf(bwyVar.getClass().getSimpleName()).concat(" does not have a Parcelizer"), e5);
        }
    }

    protected abstract boolean B();

    public final boolean C(boolean z, int i) {
        return !D(i) ? z : B();
    }

    public abstract boolean D(int i);

    public abstract byte[] E();

    public final Object[] F(Object[] objArr, int i) {
        Serializable serializable;
        if (!D(i)) {
            return objArr;
        }
        int iA = a();
        if (iA < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(iA);
        if (iA != 0) {
            int iA2 = a();
            if (iA2 == 1) {
                while (iA > 0) {
                    arrayList.add(i());
                    iA--;
                }
            } else if (iA2 == 2) {
                while (iA > 0) {
                    arrayList.add(f());
                    iA--;
                }
            } else if (iA2 == 3) {
                while (iA > 0) {
                    String strM = m();
                    if (strM == null) {
                        serializable = null;
                    } else {
                        try {
                            serializable = (Serializable) new bwv(new ByteArrayInputStream(E())).readObject();
                        } catch (IOException e) {
                            throw new RuntimeException(a.e(strM, "Unable to read Serializable object (name = ", ")"), e);
                        } catch (ClassNotFoundException e2) {
                            throw new RuntimeException(a.e(strM, "Unable to read Serializable object (name = ", ")"), e2);
                        }
                    }
                    arrayList.add(serializable);
                    iA--;
                }
            } else if (iA2 == 4) {
                while (iA > 0) {
                    arrayList.add(m());
                    iA--;
                }
            } else if (iA2 == 5) {
                while (iA > 0) {
                    arrayList.add(e());
                    iA--;
                }
            }
        }
        return arrayList.toArray(objArr);
    }

    protected abstract int a();

    public final int b(int i, int i2) {
        return !D(i2) ? i : a();
    }

    public abstract long c();

    public abstract Bundle d();

    protected abstract IBinder e();

    protected abstract Parcelable f();

    public final Parcelable g(Parcelable parcelable, int i) {
        return !D(i) ? parcelable : f();
    }

    protected abstract bww h();

    public final bwy i() throws NoSuchMethodException, SecurityException {
        String strM = m();
        if (strM == null) {
            return null;
        }
        bww bwwVarH = h();
        try {
            wx wxVar = this.a;
            Method declaredMethod = (Method) wxVar.get(strM);
            if (declaredMethod == null) {
                declaredMethod = Class.forName(strM, false, bww.class.getClassLoader()).getDeclaredMethod("read", bww.class);
                wxVar.put(strM, declaredMethod);
            }
            return (bwy) declaredMethod.invoke(null, bwwVarH);
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

    public final bwy j(bwy bwyVar, int i) {
        return !D(i) ? bwyVar : i();
    }

    protected abstract CharSequence k();

    public final CharSequence l(CharSequence charSequence, int i) {
        return !D(i) ? charSequence : k();
    }

    protected abstract String m();

    public final String n(String str, int i) {
        return !D(i) ? str : m();
    }

    protected abstract void o();

    public abstract void p(int i);

    public final void q(Object[] objArr) throws IllegalAccessException, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i;
        if (objArr == null) {
            v(-1);
            return;
        }
        int length = objArr.length;
        v(length);
        if (length > 0) {
            int i2 = 0;
            Object obj = objArr[0];
            if (obj instanceof String) {
                i = 4;
            } else if (obj instanceof Parcelable) {
                i = 2;
            } else if (obj instanceof bwy) {
                i = 1;
            } else if (obj instanceof Serializable) {
                i = 3;
            } else if (obj instanceof IBinder) {
                i = 5;
            } else if (obj instanceof Integer) {
                i = 7;
            } else {
                if (!(obj instanceof Float)) {
                    throw new IllegalArgumentException(String.valueOf(obj.getClass().getName()).concat(" cannot be VersionedParcelled"));
                }
                i = 8;
            }
            v(i);
            if (i == 1) {
                while (i2 < length) {
                    A((bwy) objArr[i2]);
                    i2++;
                }
                return;
            }
            if (i == 2) {
                while (i2 < length) {
                    x((Parcelable) objArr[i2]);
                    i2++;
                }
                return;
            }
            if (i != 3) {
                if (i == 4) {
                    while (i2 < length) {
                        y((String) objArr[i2]);
                        i2++;
                    }
                    return;
                } else {
                    if (i != 5) {
                        return;
                    }
                    while (i2 < length) {
                        z((IBinder) objArr[i2]);
                        i2++;
                    }
                    return;
                }
            }
            while (i2 < length) {
                Serializable serializable = (Serializable) objArr[i2];
                if (serializable == null) {
                    y(null);
                } else {
                    String name = serializable.getClass().getName();
                    y(name);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        objectOutputStream.writeObject(serializable);
                        objectOutputStream.close();
                        t(byteArrayOutputStream.toByteArray());
                    } catch (IOException e) {
                        throw new RuntimeException(a.e(name, "VersionedParcelable encountered IOException writing serializable object (name = ", ")"), e);
                    }
                }
                i2++;
            }
        }
    }

    public abstract void r(boolean z);

    public abstract void s(Bundle bundle);

    public abstract void t(byte[] bArr);

    public abstract void u(CharSequence charSequence);

    public abstract void v(int i);

    public abstract void w(long j);

    public abstract void x(Parcelable parcelable);

    public abstract void y(String str);

    protected abstract void z(IBinder iBinder);
}
