package com.jd.domain;

public class Page {
	// ������
		private int totalNumber;
		// ��ǰҳ��
		private int currentPage;
		// ��ҳ��
		private int totalPage;
		// ÿҳ��ʾ����
		private int pageNumber;
		
		public Page() {
		    this.currentPage = 1;
		    this.pageNumber = 5;
		}

		public int getTotalNumber() {
			return totalNumber;
		}
		
		private void count() {
			this.totalPage = this.totalNumber / this.pageNumber;
			if(this.totalNumber % this.pageNumber > 0) {
				this.totalPage++;
			}
			if(this.totalPage <= 0) {
				this.totalPage = 1;
			}
			if(this.currentPage > this.totalPage) {
				this.currentPage = this.totalPage;
			}
			if(this.currentPage <= 0) {
				this.currentPage = 1;
			}
		}
		
		public void setTotalNumber(int totalNumber) {
			this.totalNumber = totalNumber;
			this.count();
		}
		
		public int getCurrentPage() {
			return currentPage;
		}
		public void setCurrentPage(int currentPage) {
			this.currentPage = currentPage;
		}
		public int getTotalPage() {
			
			return totalPage;
		}
		public void setTotalPage(int totalPage) {
			this.totalPage = totalPage;
		}
		public int getPageNumber() {
			return pageNumber;
		}
		public void setPageNumber(int pageNumber) {
			this.pageNumber = pageNumber;
		}
}