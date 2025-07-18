package com.google.common.collect;

import defpackage.tsl;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
final class SortedLists {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PG */
    abstract class KeyAbsentBehavior {
        private static final /* synthetic */ KeyAbsentBehavior[] $VALUES = $values();
        public static final KeyAbsentBehavior INVERTED_INSERTION_INDEX;
        public static final KeyAbsentBehavior NEXT_HIGHER;
        public static final KeyAbsentBehavior NEXT_LOWER;

        /* compiled from: PG */
        /* renamed from: com.google.common.collect.SortedLists$KeyAbsentBehavior$1, reason: invalid class name */
        enum AnonymousClass1 extends KeyAbsentBehavior {
            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            public int resultIndex(int i) {
                return i - 1;
            }

            private AnonymousClass1(String str, int i) {
                super(str, i);
            }
        }

        /* compiled from: PG */
        /* renamed from: com.google.common.collect.SortedLists$KeyAbsentBehavior$2, reason: invalid class name */
        enum AnonymousClass2 extends KeyAbsentBehavior {
            private AnonymousClass2(String str, int i) {
                super(str, i);
            }

            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            public int resultIndex(int i) {
                return i;
            }
        }

        /* compiled from: PG */
        /* renamed from: com.google.common.collect.SortedLists$KeyAbsentBehavior$3, reason: invalid class name */
        enum AnonymousClass3 extends KeyAbsentBehavior {
            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            public int resultIndex(int i) {
                return ~i;
            }

            private AnonymousClass3(String str, int i) {
                super(str, i);
            }
        }

        private static /* synthetic */ KeyAbsentBehavior[] $values() {
            return new KeyAbsentBehavior[]{NEXT_LOWER, NEXT_HIGHER, INVERTED_INSERTION_INDEX};
        }

        static {
            NEXT_LOWER = new AnonymousClass1("NEXT_LOWER", 0);
            NEXT_HIGHER = new AnonymousClass2("NEXT_HIGHER", 1);
            INVERTED_INSERTION_INDEX = new AnonymousClass3("INVERTED_INSERTION_INDEX", 2);
        }

        public static KeyAbsentBehavior valueOf(String str) {
            return (KeyAbsentBehavior) Enum.valueOf(KeyAbsentBehavior.class, str);
        }

        public static KeyAbsentBehavior[] values() {
            return (KeyAbsentBehavior[]) $VALUES.clone();
        }

        public abstract int resultIndex(int i);

        private KeyAbsentBehavior(String str, int i) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PG */
    abstract class KeyPresentBehavior {
        private static final /* synthetic */ KeyPresentBehavior[] $VALUES = $values();
        public static final KeyPresentBehavior ANY_PRESENT;
        public static final KeyPresentBehavior FIRST_AFTER;
        public static final KeyPresentBehavior FIRST_PRESENT;
        public static final KeyPresentBehavior LAST_BEFORE;
        public static final KeyPresentBehavior LAST_PRESENT;

        /* compiled from: PG */
        /* renamed from: com.google.common.collect.SortedLists$KeyPresentBehavior$1, reason: invalid class name */
        enum AnonymousClass1 extends KeyPresentBehavior {
            private AnonymousClass1(String str, int i) {
                super(str, i);
            }

            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                return i;
            }
        }

        /* compiled from: PG */
        /* renamed from: com.google.common.collect.SortedLists$KeyPresentBehavior$2, reason: invalid class name */
        enum AnonymousClass2 extends KeyPresentBehavior {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                int size = list.size() - 1;
                while (i < size) {
                    int i2 = ((i + size) + 1) >>> 1;
                    if (comparator.compare(list.get(i2), e) > 0) {
                        size = i2 - 1;
                    } else {
                        i = i2;
                    }
                }
                return i;
            }

            private AnonymousClass2(String str, int i) {
                super(str, i);
            }
        }

        /* compiled from: PG */
        /* renamed from: com.google.common.collect.SortedLists$KeyPresentBehavior$3, reason: invalid class name */
        enum AnonymousClass3 extends KeyPresentBehavior {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                int i2 = 0;
                while (i2 < i) {
                    int i3 = (i2 + i) >>> 1;
                    if (comparator.compare(list.get(i3), e) < 0) {
                        i2 = i3 + 1;
                    } else {
                        i = i3;
                    }
                }
                return i2;
            }

            private AnonymousClass3(String str, int i) {
                super(str, i);
            }
        }

        /* compiled from: PG */
        /* renamed from: com.google.common.collect.SortedLists$KeyPresentBehavior$4, reason: invalid class name */
        enum AnonymousClass4 extends KeyPresentBehavior {
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                return LAST_PRESENT.resultIndex(comparator, e, list, i) + 1;
            }

            private AnonymousClass4(String str, int i) {
                super(str, i);
            }
        }

        /* compiled from: PG */
        /* renamed from: com.google.common.collect.SortedLists$KeyPresentBehavior$5, reason: invalid class name */
        enum AnonymousClass5 extends KeyPresentBehavior {
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                return FIRST_PRESENT.resultIndex(comparator, e, list, i) - 1;
            }

            private AnonymousClass5(String str, int i) {
                super(str, i);
            }
        }

        private static /* synthetic */ KeyPresentBehavior[] $values() {
            return new KeyPresentBehavior[]{ANY_PRESENT, LAST_PRESENT, FIRST_PRESENT, FIRST_AFTER, LAST_BEFORE};
        }

        static {
            ANY_PRESENT = new AnonymousClass1("ANY_PRESENT", 0);
            LAST_PRESENT = new AnonymousClass2("LAST_PRESENT", 1);
            FIRST_PRESENT = new AnonymousClass3("FIRST_PRESENT", 2);
            FIRST_AFTER = new AnonymousClass4("FIRST_AFTER", 3);
            LAST_BEFORE = new AnonymousClass5("LAST_BEFORE", 4);
        }

        public static KeyPresentBehavior valueOf(String str) {
            return (KeyPresentBehavior) Enum.valueOf(KeyPresentBehavior.class, str);
        }

        public static KeyPresentBehavior[] values() {
            return (KeyPresentBehavior[]) $VALUES.clone();
        }

        public abstract <E> int resultIndex(Comparator<? super E> comparator, E e, List<? extends E> list, int i);

        private KeyPresentBehavior(String str, int i) {
        }
    }

    private SortedLists() {
    }

    public static <E, K extends Comparable> int binarySearch(List<E> list, tsl<? super E, K> tslVar, K k, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        k.getClass();
        return binarySearch(list, tslVar, k, Ordering.natural(), keyPresentBehavior, keyAbsentBehavior);
    }

    public static <E, K> int binarySearch(List<E> list, tsl<? super E, K> tslVar, K k, Comparator<? super K> comparator, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        return binarySearch((List<? extends K>) Lists.transform(list, tslVar), k, comparator, keyPresentBehavior, keyAbsentBehavior);
    }

    public static <E extends Comparable> int binarySearch(List<? extends E> list, E e, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        e.getClass();
        return binarySearch(list, e, Ordering.natural(), keyPresentBehavior, keyAbsentBehavior);
    }

    public static <E> int binarySearch(List<? extends E> list, E e, Comparator<? super E> comparator, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        comparator.getClass();
        list.getClass();
        keyPresentBehavior.getClass();
        keyAbsentBehavior.getClass();
        if (!(list instanceof RandomAccess)) {
            list = new ArrayList(list);
        }
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int iCompare = comparator.compare(e, list.get(i2));
            if (iCompare < 0) {
                size = i2 - 1;
            } else {
                if (iCompare <= 0) {
                    return i + keyPresentBehavior.resultIndex(comparator, e, list.subList(i, size + 1), i2 - i);
                }
                i = i2 + 1;
            }
        }
        return keyAbsentBehavior.resultIndex(i);
    }
}
